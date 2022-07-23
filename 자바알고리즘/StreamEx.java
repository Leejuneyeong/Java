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
    	// list 항목 출력
    	
    	Stream<String> stream1 = list2.stream();
    	// Stream 제네릭을 만들고 그 요소에 리스트를 스트림으로 만들고 저장
    	Stream<String> filtered = stream1.filter(s->s.startsWith("c"));
    	// stream1 요소를 필터해서 stream filtered에 저장
    	
    	filtered.forEach(System.out::print);
    	// foreach문으로 filter 된 요소를 출력
    	
    	list.stream().forEach(i->System.out.print(i));
    	// list를 stream으로 변환하고 foreach문 써서 list항목 출력
    	
    	System.out.println();
    	
    	System.out.println(list.stream().filter(i->i<3).collect(Collectors.toList()));
    	System.out.println(list.stream().distinct().collect(Collectors.toList()));
    	// stream 요소안의 중복된 요소 제거
    	System.out.println(list.stream().filter(i->i<3).collect(Collectors.toList()));
    	
    	// filter(조건식) : 스트림에서 조건에 맞는 요소 가져오기
    	// list.stream() : list를 stream 으로 바꿈
    	// .collect(Collectors.toList()) : stream을 list로 변환하는 것
    	
    	Stream<String> stream2 = list2.stream();
    	// 리스트인 list2를 스트림으로 바꾸고 stream인 stream2에 저장
    	stream2.map(s->s.toUpperCase()).forEach(System.out::print);
    	
    	//filter 와 map 차이점
    	// filter는 해당 조건을 충족하는 요소들만을 새로운 스트림으로 만드는 반면
    	// map은 각각의 item을 변경하여 새로운 컨텐츠를 생성하는 기능임
    	
    	System.out.println();
    	
    	String[][] arrays = new String[][] {{"a1","a2"},{"b1","b2"},{"c1","c2"}};
    	// 2차원 배열
    	// arrays 배열 
    	Stream<String[]> stream4 = Arrays.stream(arrays);
    	// arrays의 주소 저장
    	Stream<String> stream5 = stream4.flatMap(s->Arrays.stream(s));
    	// 배열을 스트림으로 바꿔주고 여러개의 스트림을 한개의 스트림으로 합쳐줌
    	stream5.forEach(System.out::println);
    	// 출력
    	
    	Stream<String[]> stream6 = Arrays.stream(arrays);
    	// 2차원 배열을 스트림으로 변경
    	Stream<String> stream7 = stream6.flatMap(s -> Arrays.stream(s));
    	// flatMap 이용해서 스트림의 형태가 배열과 같을 때, 모든 원소를 단일 원소 스트림으로 반환
    	stream7.filter(s-> s.startsWith("a"))
    	        .map(String::toUpperCase).forEach(System.out::print);
    	
    	System.out.println();
    	List<List<String>> collectionList = new ArrayList<>();
    	collectionList.add(Arrays.asList("a", "aa", "aaa"));
    	//배열을 리스트로 바꾸고 리스트에 넣어줌
    	collectionList.add(Arrays.asList("b", "bb", "bbb"));
    	collectionList.add(Arrays.asList("c", "cc", "ccc"));
    	System.out.println(collectionList);
   
    	collectionList.stream().flatMap(s -> s.stream()).filter(aa -> "cc".equals(aa)).forEach(System.out::println);	
    	
    	
    	
    	
        	
    }
}