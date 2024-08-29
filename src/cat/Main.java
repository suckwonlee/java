package cat;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
            cat cat=new cat();
            cat.setName("AICat");
            cat.setBreeds("Persian");
            cat.setWeight(3.14159265359);

            System.out.printf("고양이 이름 : %s\n",cat.getName());;
            System.out.printf("고양이 품종 : %s\n",cat.getBreeds());
            System.out.printf("고양이 무게 : %.2f㎏\n",cat.getWeight());

            System.out.print(cat.getName()+"이 ");
            cat.claw();

            System.out.print(cat.getName()+"이 ");
            cat.meow();
        }
    }
