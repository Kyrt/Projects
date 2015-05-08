// ���������� �����
import java.util.ArrayList;
public class ArrayListExample {
  static String[] favouriteCharacters = {"Harry", "Ron", "Hermione",  "Snape", "Dumbledore", "Moody", "Riddle", "Fred"};
   int i;
   public ArrayList favouritelist = new ArrayList();
// ����� ��������� �������� �favouriteCharacters� � �favouritelist�
 private void includeCharacters(String[]favouriteCharacters)
       {
        for (i = 0; i < favouriteCharacters.length; i++) {
            // ���������� ��������� �� ������ �� ������� �favouriteCharacters�
            favouritelist.add(favouriteCharacters[i]);
            printCharacters(i);
        }
// ���������� ���������, ����������� �������� �������
        favouritelist.add(1, "george");
        favouritelist.add(4, "Peter");
    }
// ����� ������� ������� �favouritelist� �� ��������� �������
    private void printCharacters(int i) {
        System.out.println("Character " + (i + 1) + ":" + favouritelist.get(i));
    }
// ����� ������� ��� �������� �favouritelist�
    private void printCharacters() {
        System.out.println("\n");
        for(int i=0;i<favouritelist.size();i++){
        System.out.println("Character" + (i + 1) + ":" + favouritelist.get(i));
    }    }
// ����� ���������� ������ ��������� �favouritelist�
    private int sizeofCharactersList() {
        System.out.println("\n");
        System.out.println("Total No of Characters in Array:" + favouriteCharacters.length);
        System.out.println("Total No of Characters in List:" + favouritelist.size());
        return favouritelist.size();
    }
// ����� ������� ������� �������� �favouritelist� �� ���������� �����
 public void getCharacterPostion(String characterName) {
     System.out.println("\n");
        System.out.println("The position of the character\t" + characterName + "\tis\t" + favouritelist.indexOf(characterName));
    }
// ����� ������� ������� �favouritelist� �� ���������� �����
    public void removeCharacter(String characterName) {
        if(favouritelist.size()>favouriteCharacters.length){
        favouritelist.remove(characterName);
        }
        else{
             System.out.println("\n");
             System.out.println("The element\t"+favouritelist.get(favouritelist.indexOf(characterName))+"\tcannot be removed");
        }
        }
// ����� ������� ������� �favouritelist� �� ��������� �������
    public void removeCharacter(int i) {
        if(favouritelist.size()>favouriteCharacters.length){
        favouritelist.remove(i);
          }
        else{
            System.out.println("The element\t"+favouritelist.get(i)+"\tcannot be removed");
        }
    }
    public static void main(String args[]) {
        ArrayListExample example = new ArrayListExample();
        example.includeCharacters(favouriteCharacters);
        example.printCharacters();
        int size = example.sizeofCharactersList();
        example.getCharacterPostion("Ron");
        example.removeCharacter("Snape");
        example.removeCharacter(2);
        example.sizeofCharactersList();
        example.removeCharacter("Harry");
         example.removeCharacter(4);
    }
}