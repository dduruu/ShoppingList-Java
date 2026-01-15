/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppinglist;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {
        
        ArrayList <String> shoppingList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        boolean isRunning = true;
        System.out.println("Shopping List Manager");
        
        while (isRunning){
            System.out.println("\n1. Add Item");
            System.out.println("2. Show List");
            System.out.println("3. Remove Item");
            System.out.println("4. Exit");
            System.out.print("Your selection: ");
            
            String choice = input.nextLine();
          
            switch(choice){
                case "1":
                    System.out.print("Enter item name: ");
                    String item = input.nextLine();
                    shoppingList.add(item);
                    System.out.println(item + " has been added.");
                    break;
                case "2":
                    showItems(shoppingList);
                    break;
                case "3":    
                    removeItem(shoppingList , input);
                    break;
                case "4":
                    System.out.println("Exiting...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
    
    public static void showItems(ArrayList<String> list){
                if (list.isEmpty()){
                    System.out.println("Your list is empty.");
                }else{
                    for (int i=0; i<list.size(); i++){
                        System.out.println((i+1) + "." + list.get(i));
                    }
                }
            }
    
    public static void removeItem(ArrayList<String> list, Scanner in){
        if (list.isEmpty()){
            System.out.println("List is empty, there's nothing to delete. ");
            return;
        }
        System.out.print("Enter the number of the item to remove: ");
        int index = in.nextInt();
        in.nextLine();
        
        if (index > 0 && index <= list.size()){
            String removed = list.remove(index - 1);
            System.out.println(removed + " has been deleted.");
        }else{
            System.out.println("Invalid item number!");
        }
  
    }
}