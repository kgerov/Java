package _07_JavaExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class _04_LogsAggregator {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		inp.nextLine();
		ArrayList<User> log = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String nextLog = inp.nextLine();
			String[] logInfo = nextLog.split(" ");
			
			boolean flag = false;
			for (User u : log) {
				if (u.getuserName().equals(logInfo[1])) {
					flag = true;
					u.setDuration(u.getDuration()+Integer.parseInt(logInfo[2]));
					u.setIP(logInfo[0]);
				}
			}
			if (!flag) {
			User curr = new User();
			curr.setDuration(Integer.parseInt(logInfo[2]));
			curr.setuserName(logInfo[1]);
			curr.setIP(logInfo[0]);
			log.add(curr);
			}
		}
		
		Collections.sort(log, new Comparator<User>() {
		    public int compare(User v1, User v2) {
		        return v1.getuserName().compareTo(v2.getuserName());
		    }
		 });
		
		for (User user : log) {
			System.out.println(user.getuserName() + ": " + user.getDuration() + " " + user.getIP());
		}
	}

}

class User {
	private int duration;
	private String userName;
	private TreeSet<String> ip = new TreeSet<String>();
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public TreeSet<String> getIP() {
		return ip;
	}
	public void setIP(String ip) {
		this.ip.add(ip);
	}
}
