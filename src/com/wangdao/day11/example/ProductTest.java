package com.wangdao.day11.example;


import com.wangdao.day11.example.controller.ProductController;
import com.wangdao.day11.example.model.Product;

/**
 * @description:
 * @author: 景天
 * @date: 2023/10/24 17:54
 **/
/*
某电商系统后台，前端程序员需要后端程序员，提供接口来完成商品的管理，展示页面。假如前后端商量好，要求能实现CRUD操作, 采用MVC分层思想, 业务逻辑如下:

- 展示全部商品（Products）页面时，将仅装有商品对象的数组返回，前端不提供任何数据。
- 新增商品时，前端提供商品各种参数，后端需要校验ID唯一性，然后将对象插入数组，返回插入结果(true/false)。
- 查询商品, 前端提供商品ID或者商品名称(可根据ID查询或者根据商品名称查询), 后端根据信息查询商品详情, 并返回结果(商品对象)
- 更新商品(每次更新商品中的一个信息即可), 前端提供要被更新的商品ID, 以及新的产品信息(可以用数组的形式存储新的产品信息), 后端根据商品ID找到该商品, 并将新的信息替换, 返回该商品对象.
- 删除商品时，前端提供商品ID，后端将该商品删除后，返回删除结果。（成功返回true，根据ID找不到该商品即删除失败返回false）
 */
public class ProductTest {
    // 使用controller作为成员变量
    static ProductController controller = new ProductController();


    public static void main(String[] args) {

        System.out.println("----查询所有商品信息-----");
        findAllProducts();

        System.out.println("----上架(新增)商品-----");
        createProduct();


        System.out.println("----查询所有商品信息-----");
        findAllProducts();

        // 根据商品id进行查询
        System.out.println("----根据商品id进行查询-----");
        findProductByID();
        
        // 根据商品名称进行查询
        System.out.println("----根据商品名称进行查询-----");
        findProductByName();

        // 根据商品id进行更新
        System.out.println("----根据商品id进行更新-----");
        updateProductByID();

        // 根据商品id进行删除
        System.out.println("----根据商品id进行删除-----");
        deleteProductByID();
    }

    private static void deleteProductByID() {
        int id = 3;
        boolean result = controller.deleteProductByID(id);
        System.out.println(result);
    }

    private static void updateProductByID() {
        int id = 2;
        String[] newInfo = new String[3];
        newInfo[0] = "手机";
        newInfo[1] = "2600";
        newInfo[2] = "华为";
        Product product = controller.updateProductByID(id, newInfo);
        product.print();
    }

    private static void findProductByName() {
        // 前端传过来一个name
        String name = "篮球鞋";
        // 请求controller
        Product product = controller.findProductByName(name);
        product.print();
    }

    private static void findProductByID() {
        // 前端传过来1个id值
        int id = 2;
        // 请求controller
        Product product = controller.findProductByID(id);
        product.print();
    }

    private static void createProduct() {
        // 模拟前端参数
        int id = 5;
        String name = "笔记本";
        String brand = "联想";
        double price = 5999;
        // 把参数封装到对象当中
        Product product = new Product(id, name, price, brand);

        // 请求controller
        boolean result = controller.createProduct(product);
        System.out.println(result);
    }

    private static void findAllProducts() {
        // 模拟前度请求 获取所有商品数据
        // 请求Controller
        Product[] products = controller.findAllProducts();
        for (Product product : products) {
            if (product != null) {
                product.print();
            }
        }
    }
}
