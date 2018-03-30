
public class Plik {
	
		private String city;
		private String cityAscii;
		private double lat;
		private double lng;
		private Double population;
		private String country;
		private String iso2;
		private String iso3;
		private String province;

		public Plik(String fileLine) {
			String lineData[] = fileLine.split(",");
			this.city = lineData[0];
			this.cityAscii = lineData[1];
			this.lat = Double.valueOf(lineData[2]);
			this.lng = Double.valueOf(lineData[3]);
			this.population = Double.valueOf(lineData[4]);
			this.country = lineData[5];
			this.iso2 = lineData[6];
			this.iso3 = lineData[7];
			if (lineData.length >= 9) {
				this.province = lineData[8];
			} else {
			this.province = "unspecified";
			}
		}

		public String getCity() {
			return city;
		}

		public String getCityAscii() {
			return cityAscii;
		}

		public double getLat() {
			return lat;
		}

		public double getLng() {
			return lng;
		}

		public void setLng(double lng) {
			this.lng = lng;
		}

		public double getPopulation() {
			return population;
		}

		public String getCountry() {
			return country;
		}

		public String getIso2() {
			return iso2;
		}

		public String getIso3() {
			return iso3;
		}

		public String getProvince() {
			return province;
		}

		public void setProvince(String province) {
			this.province = province;
		}
		
		
		public String toString() {
		    return "City [city= "+city+ ", cityAscii= " + cityAscii + ", lat= " + lat 
		    		+ ", lng = " + lng + ", population = " + population + ", country = " + country + ", province = " + province + "]";
		  }
		

}
