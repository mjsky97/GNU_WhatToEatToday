package main;

import java.util.Map;

public class Restaurant {
	private String Res_name;
	private String Res_loca_URL;
	private Review review;
	private int star_point;
	private int [][] keyword;
	
	public void set_Res_name(String name) {}
	public void set_Res_loca_URL(String url) {}
	public void set_keyword(Map map) {}
	public Review get_review() {
		Review re = new Review();
		return re;
	}
	public String getRes_name() {
		return Res_name;
	}
	public void setRes_name(String res_name) {
		Res_name = res_name;
	}
	public String getRes_loca_URL() {
		return Res_loca_URL;
	}
	public void setRes_loca_URL(String res_loca_URL) {
		Res_loca_URL = res_loca_URL;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	public int[][] getKeyword() {
		return keyword;
	}
	public void setKeyword(int[][] keyword) {
		this.keyword = keyword;
	}
	public int getStar_point() {
		return star_point;
	}
	public void setStar_point(int star_point) {
		this.star_point = star_point;
	}
}
