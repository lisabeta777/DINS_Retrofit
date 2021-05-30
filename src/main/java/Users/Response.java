package Users;

import java.util.List;
import java.util.Objects;

public class Response{
	private List<ResponseItem> response;

	public void setResponse(List<ResponseItem> response){
		this.response = response;
	}

	public List<ResponseItem> getResponse(){
		return response;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Response)) return false;
		Response response1 = (Response) o;
		return Objects.equals(response, response1.response);
	}

	@Override
	public int hashCode() {
		return Objects.hash(response);
	}
}