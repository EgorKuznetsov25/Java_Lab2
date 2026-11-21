public class City4 {
    public String name;
    public String[] paths;

    public City4(String name) {
        this.name = name;
        this.paths = new String[0];
    }

    public City4(String name, String[] paths) {
        this.name = name;
        this.paths = paths;
    }


    @Override
    public String toString() {
        String result = name + ": [";
        for (int i = 0; i < paths.length; i++) {
            result = result + paths[i];
            if (i < paths.length - 1) {
                result = result + ", ";
            }
        }
        result = result + "]";
        return result;
    }
}
