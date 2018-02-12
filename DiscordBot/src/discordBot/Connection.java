package discordBot;

import javax.security.auth.login.LoginException;

import discordBot.listeners.MessageResponder;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Connection {

	public static void main(String[] args) {

		JDA discord = null;
		try {
			discord = new JDABuilder(AccountType.BOT).setToken(Constants.token).buildBlocking();
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		discord.addEventListener(new MessageResponder());
	}
}
