package com.xiaxinyu.mall.service;

import com.github.pagehelper.PageInfo;
import com.xiaxinyu.mall.model.pojo.Product;
import com.xiaxinyu.mall.model.request.AddCategoryReq;
import com.xiaxinyu.mall.model.request.AddProductReq;
import com.xiaxinyu.mall.model.request.UpdateCategoryReq;
import com.xiaxinyu.mall.model.request.UpdateProductReq;
import com.xiaxinyu.mall.model.vo.CategoryVO;

import java.util.List;

public interface ProductService {

    void add(AddProductReq addProductReq);

    void update(UpdateProductReq updateProductReq);

    void delete(Integer id);

    void batchUpdateSellStatus(Integer[] ids, Integer status);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    Product detail(Integer id);
}
