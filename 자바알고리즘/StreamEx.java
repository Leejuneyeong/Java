import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.in;

public class StreamEx {

    public static void main(String[] args) {
   
    	List<Integer> list = new ArrayList<>();
    	
    	List<String> list2 =Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");
    	
    	list.add(1);
    	list.add(1);
    	list.add(2);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	list.add(5);
    	
    	System.out.println(list);
    	System.out.println(list2);
    	// list �׸� ���
    	
    	Stream<String> stream1 = list2.stream();
    	// Stream ���׸��� ����� �� ��ҿ� ����Ʈ�� ��Ʈ������ ����� ����
    	Stream<String> filtered = stream1.filter(s->s.startsWith("c"));
    	// stream1 ��Ҹ� �����ؼ� stream filtered�� ����
    	
    	filtered.forEach(System.out::print);
    	// foreach������ filter �� ��Ҹ� ���
    	
    	list.stream().forEach(i->System.out.print(i));
    	// list�� stream���� ��ȯ�ϰ� foreach�� �Ἥ list�׸� ���
    	
    	System.out.println();
    	
    	System.out.println(list.stream().filter(i->i<3).collect(Collectors.toList()));
    	System.out.println(list.stream().distinct().collect(Collectors.toList()));
    	// stream ��Ҿ��� �ߺ��� ��� ����
    	System.out.println(list.stream().filter(i->i<3).collect(Collectors.toList()));
    	
    	// filter(���ǽ�) : ��Ʈ������ ���ǿ� �´� ��� ��������
    	// list.stream() : list�� stream ���� �ٲ�
    	// .collect(Collectors.toList()) : stream�� list�� ��ȯ�ϴ� ��
    	
    	Stream<String> stream2 = list2.stream();
    	// ����Ʈ�� list2�� ��Ʈ������ �ٲٰ� stream�� stream2�� ����
    	stream2.map(s->s.toUpperCase()).forEach(System.out::print);
    	
    	//filter �� map ������
    	// filter�� �ش� ������ �����ϴ� ��ҵ鸸�� ���ο� ��Ʈ������ ����� �ݸ�
    	// map�� ������ item�� �����Ͽ� ���ο� �������� �����ϴ� �����
    	
    	System.out.println();
    	
    	String[][] arrays = new String[][] {{"a1","a2"},{"b1","b2"},{"c1","c2"}};
    	// 2���� �迭
    	// arrays �迭 
    	Stream<String[]> stream4 = Arrays.stream(arrays);
    	// arrays�� �ּ� ����
    	Stream<String> stream5 = stream4.flatMap(s->Arrays.stream(s));
    	// �迭�� ��Ʈ������ �ٲ��ְ� �������� ��Ʈ���� �Ѱ��� ��Ʈ������ ������
    	stream5.forEach(System.out::println);
    	// ���
    	
    	Stream<String[]> stream6 = Arrays.stream(arrays);
    	// 2���� �迭�� ��Ʈ������ ����
    	Stream<String> stream7 = stream6.flatMap(s -> Arrays.stream(s));
    	// flatMap �̿��ؼ� ��Ʈ���� ���°� �迭�� ���� ��, ��� ���Ҹ� ���� ���� ��Ʈ������ ��ȯ
    	stream7.filter(s-> s.startsWith("a"))
    	        .map(String::toUpperCase).forEach(System.out::print);
    	
    	System.out.println();
    	List<List<String>> collectionList = new ArrayList<>();
    	collectionList.add(Arrays.asList("a", "aa", "aaa"));
    	//�迭�� ����Ʈ�� �ٲٰ� ����Ʈ�� �־���
    	collectionList.add(Arrays.asList("b", "bb", "bbb"));
    	collectionList.add(Arrays.asList("c", "cc", "ccc"));
    	System.out.println(collectionList);
   
    	collectionList.stream().flatMap(s -> s.stream()).filter(aa -> "cc".equals(aa)).forEach(System.out::println);	
    	
    	
    	
    	
        	
    }
}