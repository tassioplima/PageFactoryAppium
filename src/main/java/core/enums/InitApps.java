package core.enums;

import core.interfaces.AppsInterface;

public enum InitApps implements AppsInterface {
	
	CALC_PACKAGE{

		public String appConfig() {
			String valor = "com.google.android.calculator";
			return valor;
		}
		
	},
	
	CALC_ACTIVITY {

		public String appConfig() {
			String valor = "com.android.calculator2.Calculator}";
			return valor;
		}
		
	},

	HAPPN_PACKAGE {

		public String appConfig() {
			String valor = "com.ftw_and_co.happn";
			return valor;
		}

	},

	HAPPN_ACTIVITY {

		public String appConfig() {
			String valor = "com.ftw_and_co.happn.ui.home.HomeActivity";
			return valor;
		}

	},

	FACEBOOK_PACKAGE {

		public String appConfig() {
			String valor = "com.facebook.katana";
			return valor;
		}

	},

	FACEBOOK_ACTIVITY {

		public String appConfig() {
			String valor = "com.facebook.katana.LoginActivity";
			return valor;
		}

	};

}
