import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ApiEndpoints {

	public static void main(String[] args){

		try {
			var in = 1;

			HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI("https://github.com/user")).GET().build();

			HttpClient client = HttpClient.newHttpClient();

			HttpResponse<String> response = client.send(getRequest,  BodyHandlers.ofString());

			System.out.println(response.body());
			System.out.println(in);

		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
}
