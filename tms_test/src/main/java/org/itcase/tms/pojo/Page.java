package org.itcase.tms.pojo;/*
 *ClassName:page
 *UserName:小阎王丷
 *CreateTime:2020/10/26 14:13
 */

import java.util.List;

public class Page<E> {
    //结果集
    private List<E> list;

    //查询记录数
    private long totalRecords;

    //每页多少条数据
    private long pageSize;

    //第几页
    private long pageNo;

    /**
     * 总页数
     * @return
     */
    public long getTotalPages() {
        return (totalRecords + pageSize - 1) / pageSize;
    }

    /**
     * 取得首页
     * @return
     */
    public long getTopPageNo() {
        return 1;
    }

    /**
     * 上一页
     * @return
     */
    public long getPreviousPageNo() {
        if (pageNo <= 1) {
            return 1;
        }
        return pageNo - 1;
    }

    /**
     * 下一页
     * @return
     */
    public long getNextPageNo() {
        if (pageNo >= getBottomPageNo()) {
            return getBottomPageNo();
        }
        return pageNo + 1;
    }

    /**
     * 取得尾页
     * @return
     */
    public long getBottomPageNo() {
        return getTotalPages();
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public long getTotalRecords(long totalRecords) {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getPageNo() {
        return pageNo;
    }

    public void setPageNo(long pageNo) {
        this.pageNo = pageNo;
    }
}

