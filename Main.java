import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            nums.add(rnd.nextInt(41) - 20);
        }
        System.out.println( "Динамический массив: " + nums);
        int max = Collections.max(nums);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Номер последнего элемента, равного максимальному: " + nums.lastIndexOf(max));
        Collections.sort(nums);
        System.out.println("Сортировка чисел по возрастанию: " + nums);
        for (int i = 0; i < nums.size();){
            if (nums.get(i) <0){
                nums.remove(i);
            } else {
                ++i;
            }
        }
        System.out.println( "Удаление отрицательных: " + nums + "\n");

        LinkedList<Double> list = new LinkedList<>();
        for(int i = 0; i < 10; ++i){
            double x = rnd.nextDouble(41) - 20;
            list.add(Math.round(x * 100)/100.0);
        }
//        list.add(0.0);
        list.sort(Comparator.reverseOrder());

        System.out.println("Связный список отсортированный по убыванию: " + list);
        System.out.println("В списке " + (!list.contains(0.0) ? "нет нулевых элементов": "есть нулевые элементы"));
        double avg = Math.round((list.getFirst() + list.getLast())/2 * 100)/100.0;
        int ind = list.size()/2;
        list.add(ind, avg);
        System.out.println("Добавление среднего ариф между первым и последним: " + avg + ". Список: " + list +"\n");

        String text = """
                Some collection implementations have restrictions on the elements that they may contain. \
               For example, some implementations prohibit null elements, and some have restrictions on the types of their elements. \
                Attempting to add an ineligible element throws an unchecked exception, typically NullPointerException or ClassCastException. \
                Attempting to query the presence of an ineligible element may throw an exception, or it may simply return false; \
                some implementations will exhibit the former behavior and some will exhibit the latter. \
                More generally, attempting an operation on an ineligible element whose completion would not result in the insertion \
                of an ineligible element into the collection may throw an exception or it may succeed, at the option of the implementation. \
                Such exceptions are marked as optional in the specification for this interface. \
                I need a fish that truly represents my essence. \
                Class Object is the root of the class hierarchy. Every class has Object as a superclass. \
                All objects, including arrays, implement the methods of this class. \
                The group is running on the beach.""";

        String[] texts = text.toLowerCase().split("[\\s,.;]+");
        HashSet<String> words = new HashSet<>();
        Collections.addAll(words, texts);
        System.out.println("Слов в тексте: " + texts.length + ", элементов в множестве: " + words.size());
        System.out.println("Множество меньше на: " + (texts.length - words.size()));

        String s = "collection represents group of objects";
        boolean canMake = words.containsAll(Arrays.asList(s.split(" ")));
        System.out.println("Предложение \"" + s + "\" " + (canMake ? "можно" : "нельзя") + " составить");
    }
}