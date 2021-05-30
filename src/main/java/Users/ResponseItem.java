package Users;

import java.util.Objects;

public class ResponseItem{
	private int id;
	private String title;
	private String body;
	private int userId;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setBody(String body){
		this.body = body;
	}

	public String getBody(){
		return body;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ResponseItem)) return false;
		ResponseItem that = (ResponseItem) o;
		return id == that.id && userId == that.userId && Objects.equals(title, that.title) && Objects.equals(body, that.body);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, body, userId);
	}

	@Override
	public String toString() {
		return "\"userId\": " + userId +
				",\n" + "\"id\": " + id + ",\n" +
				"\"title\": \"" + title + "\",\n" +
				"\"body=\"" + body + "\"." + "\n";
	}
}
