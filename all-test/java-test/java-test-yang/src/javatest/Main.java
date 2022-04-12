package javatest;

public class Main {

	public static void main(String[] args) {

		// 1.get input
		var inputLine = InputHandler.GetInput(InputHandler.scan);

		// 2.print list
		System.out.println();
		var strList = InputHandler.ChangeInputToArray(inputLine);
		InputHandler.PrintInputList(strList);

		// 3.1 print post code
		var getPostCodeResult = PostCodeChecker.GetPostCodeFromList(strList);
		System.out.println(getPostCodeResult);

		// 3.2.1 print address from post code table
		// create tables
		AddressTableManager.createTableList();

		// search address form tables
		var currentSearchPostCode = PostCodeChecker.inputPostCode;
		var searchResult = PostCodeChecker.SearchPostCode(currentSearchPostCode);
		System.out.println(searchResult);

		// 3.2.2 search input post code address
		System.out.println();
		var inputPostCode = InputHandler.GetInputPostCode(InputHandler.scan);
		searchResult = PostCodeChecker.SearchPostCode(inputPostCode);
		System.out.println();
		System.out.println(searchResult);

		// close message
		System.out.println();
		System.out.println("èIóπÇµÇ‹ÇµÇΩÅB");

		InputHandler.scan.close();

	}

}
