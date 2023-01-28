package spring23.friendlist.web;
import spring23.friendlist.domain.Friend;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FriendController {
	
	private ArrayList<Friend> friendsList = new ArrayList<>();

	@RequestMapping(value="/friendlist", method=RequestMethod.GET)
	public String viewFriends(@ModelAttribute Friend friend, Model model) {
		friendsList.add(friend);
		model.addAttribute("addFriend", friendsList);
		return "friendlist";
	}
}
