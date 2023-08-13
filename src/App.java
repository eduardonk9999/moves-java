import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //https://pokeapi.glitch.me/v1/pokemon/1
        
        // fazer uma conexão HTTP e buscar os dados
        String url = "https://imdb-api.com/en/API/Top250Movies/k_3q5hkc0z";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> send = client.send(request, BodyHandlers.ofString());

        // pegar só os dados que interessam (titulo, poster, classificacao)


        // exibir e manipular os dados
        

    }
}
