package dsa.assignment2;

import java.util.ArrayList;

class RootNode {

	String name;
	RootNode nextRootNode;
	RootNode parentNode;
	ArrayList<RootNode> Children = new ArrayList<RootNode>();
	RootNode(String name) {
		this.nextRootNode = null;
		this.parentNode = null;
		this.name = name; 
	}
}

public class CommandShell {
	RootNode Root;
	RootNode current =Root;
	CommandShell(){
		 Root = new RootNode("Root");
		 this.current = this.Root;
	}
	void createDirecotry(String name ){
		RootNode newNode = new RootNode(name);
		RootNode temp = this.current;
		temp.Children.add(newNode);
		newNode.parentNode = temp;
	}
	
	public void printList(RootNode allDirecotry) {
		if(allDirecotry.Children != null){
			for (int i = 0; i < allDirecotry.Children.size(); i++) {
				System.out.println("\u251c"+allDirecotry.Children.get(i).name+"\u251c \u251c");
				printList(allDirecotry.Children.get(i));
			}
		}
		
	}
	public String goInsideTheDirectory(String string) {
		RootNode temp = this.current;
		for (int i = 0; i < temp.Children.size(); i++) {
			if(temp.Children.get(i).name.equals(string)){
				this.current = temp.Children.get(i);
				return string;
			}
		}
		return  "No Direcotry found";
	}
//	
//	public void backtoPrarnt(){
//		this.current = this.current.parentNode;
//	}
	public String goBackToTheDirectory() {
		this.current = this.current.parentNode;// TODO Auto-generated method stub
		return current.name;
	}
	
	public String ShowCurrentDirecotry(){
		return this.current.name;
	}
	
	public String findFolder(String string,RootNode allDirecotry) {
		
		if(string.equals(allDirecotry.name)){
			return "yes";
		}
		if(allDirecotry.Children != null){
			for (int i = 0; i < allDirecotry.Children.size(); i++) {
				findFolder(string , allDirecotry.Children.get(i));
			}
		}
		return "No";
	}

}
