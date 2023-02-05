package SAP.UI;


import java.util.ArrayList;

public class SAP {

    private ArrayList<String> data;

    public SAP() {
        this.data = new ArrayList<>();
    }

    public void addData(String data) {
        this.data.add(data);
    }

    public ArrayList<String> search(String query) {
        ArrayList<String> results = new ArrayList<>();

        for(String datum : this.data) {
            if(datum.contains(query)) {
                results.add(datum);
            }
        }

        return results;
    }

    public ArrayList<String> filter(String query) {
        ArrayList<String> results = new ArrayList<>();

        for(String datum : this.data) {
            if(datum.startsWith(query)) {
                results.add(datum);
            }
        }

        return results;
    }
}
