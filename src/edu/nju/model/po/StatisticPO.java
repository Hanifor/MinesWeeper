package edu.nju.model.po;

import java.io.Serializable;

public class StatisticPO implements Serializable{

	private double winrate;
	private int wins;
	private int sum;
	private int level;
	private int width;
	private int height;
	private String name;
	public StatisticPO() {
		super();
	}

	public StatisticPO(double winrate, int wins, int sum, int level, int width,
			int height) {
		super();
		this.winrate = winrate;
		this.wins = wins;
		this.sum = sum;
		this.level = level;
		this.width = width;
		this.height = height;
		this.name = "Unknow Name";
	}

	public double getWinrate() {
		return winrate;
	}

	public void setWinrate(double winrate) {
		this.winrate = winrate;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
