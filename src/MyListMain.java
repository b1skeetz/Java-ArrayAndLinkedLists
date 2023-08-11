public class MyListMain {
    public static void main(String[] args) {
        MyList mylist = new MyArrayList();
        System.out.println("----------ARRAY LIST----------");
        for(int i = 0; i < 5; i++){
            mylist.add("item #" + i);
        }

        mylist.add("item #3");

        //mylist.set(8, "Maxim");
        // mylist.remove(9);

        System.out.println(mylist.indexOf("item #3"));
        System.out.println(mylist.lastIndexOf("item #3"));
        System.out.println(mylist.lastIndexOf("item #3"));

        for(int i = 0; i < mylist.size(); i++){
            System.out.print(mylist.get(i) + " ");
        }

        System.out.println();

        mylist.add(4, "added item 10");
        mylist.add(2, "added item 155");
        //mylist.add(7, "added item 109");

        for(int i = 0; i < mylist.size(); i++){
            System.out.print(mylist.get(i) + "; ");
        }

        System.out.println(mylist.contains("item #55"));
        System.out.println(mylist.indexOf("item #2"));
        System.out.println(mylist.lastIndexOf("item #2"));
        /*---------------------------------------------------------*/

        MyList mylinkedlist = new MyLinkedList();
        System.out.println("----------LINKED LIST----------");
        for(int i = 0; i < 10; i++){
            mylinkedlist.add("item #" + i);
        }

        mylinkedlist.add(6, "Car");
        mylinkedlist.add(4, "Watch");

        for(int i = 0; i < mylinkedlist.size(); i++){
            System.out.print(mylinkedlist.get(i) + " ");
        }
        System.out.println();
        System.out.println(mylinkedlist.contains("item #6"));
        System.out.println(mylinkedlist.indexOf("item #2"));
        System.out.println(mylinkedlist.lastIndexOf("item #2"));


        /*List<String> list = new ArrayList<>();
        list.add("Andrey");
        list.set(20, "Maxis");
        list.get(20);*/


/*
        LinkedList<Integer> sorted = new LinkedList<>();
        sorted.add(6);
        sorted.add(4);
        sorted.add(8);
        sorted.add(2);
        for(int i = 0; i < sorted.size(); i++){
            System.out.print(sorted.get(i) + " ");
        }
        sorted.sort(Comparator.naturalOrder());
        System.out.println();
        for(int i = 0; i < sorted.size(); i++){
            System.out.print(sorted.get(i) + " ");
        }*/
/*
        mylist.add(4, "added item 10");
        mylist.add(2, "added item 155");
        mylist.add(7, "added item 109");

        for(int i = 0; i < mylist.size(); i++){
            System.out.print(mylist.get(i) + " ");
        }

        /*List<String> list = new ArrayList<>();
        list.add("Andrey");
        list.set(20, "Maxis");
        list.get(20);*/
    }
}
