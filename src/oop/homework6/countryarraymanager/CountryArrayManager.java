package oop.homework6.countryarraymanager;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getPopulation() < newArray[j].getPopulation()) {
                    Country tmp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population 
     * using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getPopulation() > newArray[j].getPopulation()) {
                    Country tmp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = newArray.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (newArray[j-1].getArea() > newArray[j].getArea()) {
                    Country tmp = newArray[j-1];
                    newArray[j-1] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = newArray.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (newArray[j-1].getArea() < newArray[j].getArea()) {
                    Country tmp = newArray[j-1];
                    newArray[j-1] = newArray[j];
                    newArray[j] = tmp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     * using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i].getGdp() < newArray[i - 1].getGdp()) {
                shiftElement(newArray, i);
            }
        }

        return newArray;
    }

    public void shiftElement(Country[] array, int i) {
        Country def = array[i];
        while ((i > 0) && array[i - 1].getGdp() > def.getGdp()) {
            array[i] = array[i - 1];
            i--;
        }
        array[i] = def;

    }

    /**
     * Sort the countries in order of increasing GDP 
     * using insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i].getGdp() > newArray[i - 1].getGdp()) {
                shiftElement2(newArray, i);
            }
        }
        return newArray;
    }

    public void shiftElement2(Country[] array, int i) {
        Country def = array[i];
        while ((i > 0) && array[i - 1].getGdp() < def.getGdp()) {
            array[i] = array[i - 1];
            i--;
        }
        array[i] = def;

    }

    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] newArray = new AfricaCountry[this.countries.length];
        int appendIndex = 0;
        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof AfricaCountry) {
                newArray[appendIndex++] = (AfricaCountry) countries[i];
            }
        }
        return newArray;
    }

    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] newArray = new AsiaCountry[this.countries.length];
        int appendIndex = 0;
        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                newArray[appendIndex++] = (AsiaCountry) countries[i];
            }
        }
        return newArray;
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] newArray = new EuropeCountry[this.countries.length];
        int appendIndex = 0;
        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                newArray[appendIndex++] = (EuropeCountry) countries[i];
            }
        }
        return newArray;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] newArray = new NorthAmericaCountry[this.countries.length];
        int appendIndex = 0;
        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                newArray[appendIndex++] = (NorthAmericaCountry) countries[i];
            }
        }
        return newArray;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] newArray = new OceaniaCountry[this.countries.length];
        int appendIndex = 0;
        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                newArray[appendIndex++] = (OceaniaCountry) countries[i];
            }
        }
        return newArray;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        SouthAmericaCountry[] newArray = new SouthAmericaCountry[this.countries.length];
        int appendIndex = 0;
        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof SouthAmericaCountry) {
                newArray[appendIndex++] = (SouthAmericaCountry) countries[i];
            }
        }
        return newArray;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        if (howMany > length) {
            howMany = length;
        }
        Country[] arraySortPopulous = sortByDecreasingPopulation();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = arraySortPopulous[i];
        }

        return result;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        if (howMany > length) {
            howMany = length;
        }
        Country[] arraySortPopulous = sortByIncreasingPopulation();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = arraySortPopulous[i];
        }

        return result;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] arraySortArea = sortByDecreasingArea();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = arraySortArea[i];
        }

        return result;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        if (howMany > length) {
            howMany = length;
        }
        Country[] arraySortArea = sortByIncreasingArea();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = arraySortArea[i];
        }

        return result;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        if (howMany > length) {
            howMany = length;
        }
        Country[] arraySortGdp = sortByDecreasingGdp();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = arraySortGdp[i];
        }

        return result;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        if (howMany > length) {
            howMany = length;
        }
        Country[] arraySortGdp = sortByIncreasingGdp();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = arraySortGdp[i];
        }

        return result;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
