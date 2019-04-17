package view;


import model.EnumSuite;
import model.File;
import model.FileBuilder;
import model.SheetEditor;
import model.Suite;
import model.SuiteFactory;

public class Client {

	public static void main(String[] args) {
		Suite suiteGoogle = SuiteFactory.getInstance().criar(EnumSuite.GOOGLE);
		Suite suiteMicrosoft = SuiteFactory.getInstance().criar(EnumSuite.MICROSOFT);
		Suite suiteLibre = SuiteFactory.getInstance().criar(EnumSuite.LIBREOFFICE);
		
		SheetEditor sEditorMicrosoft = suiteMicrosoft.createSheetEditor();
		SheetEditor sEditorGoogle = suiteGoogle.createSheetEditor();
		File f1 = sEditorGoogle.newFile("Testing a lot of patterns", "/aqui/ali/algumacoisa").owner("Neil").copy(true).create();
		File f2 = f1.getClone();
		f2.setCopy(false);
		f2.setOwner("Valéria");
		File f3 = f2.getClone();
		
		System.out.println("Arquivo F1: " + f1);
		System.out.println("Arquivo F2: " + f2);
		System.out.println("Arquivo F3: " + f3);
	}

}
