package model;

public class SuiteFactory implements Factory {
	private static SuiteFactory instance = null;
	
	public synchronized static SuiteFactory getInstance() {
		if(SuiteFactory.instance == null) {
			SuiteFactory.instance = new SuiteFactory();
		}
		return instance;
	}

	@Override
	public Suite criar(EnumSuite nomeSuite) {
		if(nomeSuite == EnumSuite.GOOGLE) 
			return new GoogleSuiteFactory();
		else if(nomeSuite == EnumSuite.MICROSOFT)
			return new MicrosoftSuiteFactory();
		else if(nomeSuite == EnumSuite.LIBREOFFICE)
			return new LibreSuiteFactory();
		else
			return null;
	}

}
