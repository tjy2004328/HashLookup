import java.util.*;

public class HashLookup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入数组元素个数
        System.out.print("请输入数组元素的个数: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // 吸收换行符

        // 创建哈希表
        Map<String, List<Integer>> hashMap = new HashMap<>();

        // 读取数组元素
        System.out.println("请输入 " + n + " 个元素（只输入值）：");
        for (int i = 0; i < n; i++) {
            System.out.print("输入第 " + (i + 1) + " 个元素的值: ");
            String value = scanner.nextLine();

            // 将值作为键，索引（序号）作为值的列表
            hashMap.computeIfAbsent(value, k -> new ArrayList<>()).add(i + 1); // i + 1 作为序号
        }

        // 进行查找
        System.out.print("请输入要查找的元素值: ");
        String searchValue = scanner.nextLine();

        List<Integer> indices = hashMap.get(searchValue);
        if (indices != null && !indices.isEmpty()) {
            System.out.println("元素值 \"" + searchValue + "\" 在数组中的序号为: " + indices);
        } else {
            System.out.println("未找到对应的元素.");
        }

        scanner.close();
    }
}