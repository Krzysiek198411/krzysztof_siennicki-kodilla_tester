public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 990, 2015);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.findYear();
        notebook.chooseYear();

        Notebook heavyNotebook = new Notebook(1100, 1490, 2019);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.findYear();
        heavyNotebook.chooseYear();

        Notebook oldNotebook = new Notebook(1600, 500,2009);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.findYear();
        oldNotebook.chooseYear();

        Notebook workNotebook = new Notebook(3600, 120,2004);
        System.out.println(workNotebook.weight + " " + workNotebook.price + " " + workNotebook.year);
        workNotebook.checkPrice();
        workNotebook.checkWeight();
        workNotebook.checkYear();
        workNotebook.findYear();
        workNotebook.chooseYear();

        Notebook easyNotebook = new Notebook(490, 3600,2019);
        System.out.println(easyNotebook.weight + " " + easyNotebook.price + " " + easyNotebook.year);
        easyNotebook.checkPrice();
        easyNotebook.checkWeight();
        easyNotebook.checkYear();
        easyNotebook.findYear();
        easyNotebook.chooseYear();
    }
}