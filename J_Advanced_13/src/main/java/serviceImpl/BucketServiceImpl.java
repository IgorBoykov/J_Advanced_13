package serviceImpl;

import java.util.List;

import Dao.BucketDao;
import dao_Impl.BucketImpl;
import domain.Bucket;
import service.BucketService;

public class BucketServiceImpl implements BucketService {

	private BucketDao bucketDao;
	private static BucketService bucketServiceImpl;

	private BucketServiceImpl() {
		bucketDao = new BucketImpl();
	}

	public static BucketService getBucketService() {
		if (bucketServiceImpl == null) {
			bucketServiceImpl = new BucketServiceImpl();
		}

		return bucketServiceImpl;
	}

	@Override
	public Bucket create(Bucket t) {
		return bucketDao.create(t);
	}

	@Override
	public Bucket read(Integer id) {
		return bucketDao.read(id);
	}

	@Override
	public Bucket update(Bucket t) {
		return bucketDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		bucketDao.delete(id);

	}

	@Override
	public List<Bucket> readAll() {
		return bucketDao.readAll();
	}

}
