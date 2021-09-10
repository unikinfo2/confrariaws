package com.apirest.confrariaws;

//import java.util.UUID;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.apirest.confrariaws.document.Produto;
//import com.apirest.confrariaws.repository.ProdutoRepository;
//
//import reactor.core.publisher.Flux;

//@Component
//public class DummyData implements CommandLineRunner {
//	
//	private final ProdutoRepository produtoRepository;
//	
//	DummyData(ProdutoRepository produtoRepository){
//		this.produtoRepository = produtoRepository;
//	}
//	
//	@Override
//	public void run(String... args) throws Exception {
//		produtoRepository.deleteAll()
//		  .thenMany(
//				  Flux.just("Vinho Santa Helena", "Vinho Calamares", "Vinho Bento Gonçalves")
//				  .map(descricao -> new Produto(UUID.randomUUID().toString(), descricao))
//				  .flatMap(produtoRepository::save))
//		  		  .subscribe(System.out::println);
//	}
//
//}
