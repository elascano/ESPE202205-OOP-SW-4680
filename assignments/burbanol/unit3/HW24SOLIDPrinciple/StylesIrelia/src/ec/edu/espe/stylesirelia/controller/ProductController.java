package ec.edu.espe.stylesirelia.controller;

import ec.edu.espe.stylesirelia.model.Product;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class ProductController extends BasicController<Product> {

    public ProductController(Product object, String collectionName) {
        super(object, collectionName);
    }
     public ProductController() {
        super(new Product(), "products");
    }
     
     
     
    public Document buildDocument(Product product) {
        Document document = new Document();

        document.append("name", product.getName()).
                append("price", product.getPrice()).
                append("expiration", product.getExpiration()).
                append("stock", product.getStock());
        return document;
    }

}
