// подключаем класс
import java.util.ArrayList;
public class ArrayListExample {
  static String[] favouriteCharacters = {"Harry", "Ron", "Hermione",  "Snape", "Dumbledore", "Moody", "Riddle", "Fred"};
   int i;
   public ArrayList favouritelist = new ArrayList();
// метод добавл€ет элементы СfavouriteCharactersТ в СfavouritelistТ
 private void includeCharacters(String[]favouriteCharacters)
       {
        for (i = 0; i < favouriteCharacters.length; i++) {
            // добавление элементов по одному из массива СfavouriteCharactersТ
            favouritelist.add(favouriteCharacters[i]);
            printCharacters(i);
        }
// добавление элементов, посредством указани€ позиций
        favouritelist.add(1, "george");
        favouritelist.add(4, "Peter");
    }
// метод выводит элемент СfavouritelistТ по указанной позиции
    private void printCharacters(int i) {
        System.out.println("Character " + (i + 1) + ":" + favouritelist.get(i));
    }
// метод выводит все элементы СfavouritelistТ
    private void printCharacters() {
        System.out.println("\n");
        for(int i=0;i<favouritelist.size();i++){
        System.out.println("Character" + (i + 1) + ":" + favouritelist.get(i));
    }    }
// метод возвращает размер коллекции СfavouritelistТ
    private int sizeofCharactersList() {
        System.out.println("\n");
        System.out.println("Total No of Characters in Array:" + favouriteCharacters.length);
        System.out.println("Total No of Characters in List:" + favouritelist.size());
        return favouritelist.size();
    }
// метод выводит позицию элемента СfavouritelistТ по указанному имени
 public void getCharacterPostion(String characterName) {
     System.out.println("\n");
        System.out.println("The position of the character\t" + characterName + "\tis\t" + favouritelist.indexOf(characterName));
    }
// метод удал€ет элемент СfavouritelistТ по указанному имени
    public void removeCharacter(String characterName) {
        if(favouritelist.size()>favouriteCharacters.length){
        favouritelist.remove(characterName);
        }
        else{
             System.out.println("\n");
             System.out.println("The element\t"+favouritelist.get(favouritelist.indexOf(characterName))+"\tcannot be removed");
        }
        }
// метод удал€ет элемент СfavouritelistТ по указанной позиции
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