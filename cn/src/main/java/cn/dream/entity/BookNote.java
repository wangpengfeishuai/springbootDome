package cn.dream.entity;


/**
 * @author xx
 * @time 2019年4月2日10:05:44 存储文章信息
 */
public class BookNote {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 内容
	 */
	private String book;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 作者
	 */
	private String author;
	/**
	 * 创建时间
	 */
	private String statrTime;
	/**
	 * 上次修改时间
	 */
	private String updateTime;
	/**
	 * 文章状态 0新增  1保存 2提交 3发布 4删除
	 */
	private String aStauts;
	/**
	 * 备注
	 */
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	public String getStatrTime() {
		return statrTime;
	}

	public void setStatrTime(String statrTime) {
		this.statrTime = statrTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getaStauts() {
		return aStauts;
	}

	public void setaStauts(String aStauts) {
		this.aStauts = aStauts;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BookNote() {
		super();
	}


	public BookNote(Integer id, String book, String title, String author, String statrTime, String updateTime,
			String aStauts, String remark) {
		super();
		this.id = id;
		this.book = book;
		this.title = title;
		this.author = author;
		this.statrTime = statrTime;
		this.updateTime = updateTime;
		this.aStauts = aStauts;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "BookNote [id=" + id + ", book=" + book + ", title=" + title + ", author=" + author + ", statrTime="
				+ statrTime + ", updateTime=" + updateTime + ", aStauts=" + aStauts + ", remark=" + remark + "]";
	}


}
