package subway.view.mainview;

import subway.controller.OutputController;
import subway.domain.Menu;
import java.util.LinkedHashMap;

public class MainMenu {
	private static MainMenu mainMenu;
	public static LinkedHashMap<String, Menu> mainMenus = new LinkedHashMap<>();
	
	public MainMenu() {
		setMenu();
	}
	
	static void setMenu() {
		mainMenus.put(FindPath.getInstance().getMenuKey(), FindPath.getInstance());
		mainMenus.put(Exit.getInstance().getMenuKey(), Exit.getInstance());
	}
	
	public void printMenu() {
		OutputController.printMainMenu(mainMenus, "\n## 메인 화면"); //TODO enum으로 관리하기
	}
	
	public static MainMenu getInstance() {
		if (mainMenu == null) {
			mainMenu = new MainMenu();
		}
		return mainMenu;
	}
}
