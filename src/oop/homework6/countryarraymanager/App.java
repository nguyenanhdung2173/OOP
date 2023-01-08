package oop.homework6.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        System.out.println("Original data");
        testOriginalData();
        System.out.println("all country of Africa: ");
        testFilterAfricaCountry();
        System.out.println("all country of Asia: ");
        testFilterAsiaCountry();
        System.out.println("all country of Europe: ");
        testFilterEuropeCountry();
        System.out.println("all counry of North America: ");
        testFilterNorthAmericaCountry();
        System.out.println("all country of Oceania: ");
        testFilterOceaniaCountry();
        System.out.println("all country of South America: ");
        testFilterSouthAmericaCountry();

        System.out.println("List country sort decreasing by Population:");
        testSortDecreasingByPopulation();
        System.out.println("List country sort increasing by Population:");
        testSortIncreasingByPopulation();
        System.out.println("List country sort by decreasing by area:");
        testSortDecreasingByArea();
        System.out.println("List country sort by increasing by area:");
        testSortIncreasingByArea();
        System.out.println("List country sort by decreasing by gdp:");
        testSortDecreasingByGdp();
        System.out.println("List country sort by increasing by gdp:");
        testSortIncreasingByGdp();

        System.out.println("filter the most population country: ");
        testFilterMostPopulousCountries();
        System.out.println("filter the least population country: ");
        testFilterLeastPopulousCountries();
        System.out.println("filter the largest area country: ");
        testFilterLargestAreaCountries();
        System.out.println("filter the smallest area country: ");
        testFilterSmallestAreaCountries();
        System.out.println("filter the highest gdp country: ");
        testFilterHighestGdpCountries();
        System.out.println("filter the lowest gdp country: ");
        testFilterLowestGdpCountries();

    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));
            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                * TODO: create Country and append countries into 
                * CountryArrayManager here.
                */


                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String region = dataList.get(5);
                if (region.equals("Oceania")) {
                    Country country = new OceaniaCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                } else if (region.equals("Asia")) {
                    Country country = new AsiaCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                } else if (region.equals("Europe")) {
                    Country country = new EuropeCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                } else if (region.equals("North America")) {
                    Country country = new NorthAmericaCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                } else if (region.equals("South America")){
                    Country country = new SouthAmericaCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                } else {
                    Country country = new AfricaCountry(code, name, population, area, gdp);
                    countryManager.append(country);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(10);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(10);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(10);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(10);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(10);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(40);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }
}
