package dmacc.beans;

import java.util.Random;

public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game() {
		super();
	}
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}

	/**
	 * @return the player1
	 */
	public String getPlayer1() {
		return player1;
	}

	/**
	 * @param player1 the player1 to set
	 */
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	/**
	 * @return the computerPlayer
	 */
	public String getComputerPlayer() {
		return computerPlayer;
	}

	/**
	 * @param computerPlayer the computerPlayer to set
	 */
	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}

	/**
	 * @return the winner
	 */
	public String getWinner() {
		return winner;
	}

	/**
	 * @param winner the winner to set
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	public void setComputerPlayer() {
		Random num = new Random();
		int answer = num.nextInt(5) + 1;
		String player;
		if(answer == 1) {
			player = "rock";
		}else if(answer == 2) {
			player = "paper";
		}else if(answer == 3){
			player = "scissors";
		}else if(answer == 4){
			player = "lizard";
		}else {
			player = "spock";
		}
		
		this.setComputerPlayer(player);
	}
	
	public void determineWinner() {
		String winner = "Computer";
		if(player1.equals("rock") && computerPlayer.equals("scissors")) {
			winner = "player";
		} else if(player1.equals("rock") && computerPlayer.equals("lizard")) {
			winner = "player";
		} else if(player1.equals("scissors") && computerPlayer.equals("paper")) {
			winner = "player";
		} else if(player1.equals("scissors") && computerPlayer.equals("lizard")) {
			winner = "player";
		} else if(player1.equals("paper") && computerPlayer.equals("rock")) {
			winner = "player";
		} else if(player1.equals("paper") && computerPlayer.equals("spock")) {
			winner = "player";
		} else if(player1.equals("lizard") && computerPlayer.equals("paper")) {
			winner = "player";
		} else if(player1.equals("lizard") && computerPlayer.equals("spock")) {
			winner = "player";
		} else if(player1.equals("spock") && computerPlayer.equals("scissors")) {
			winner = "player";
		} else if(player1.equals("spock") && computerPlayer.equals("rock")) {
			winner = "player";
		}
		
		if(player1.equalsIgnoreCase(computerPlayer)) {
			winner = "both players";
		}
		
		this.setWinner(winner);
	}

}
