package uk.ac.belfastmet.rhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.rhi.domain.Rhi;
import uk.ac.belfastmet.rhi.repositories.RhiRepository;


@Service
public class RhiServiceImpl implements RhiRestService {

	@Autowired
	private RhiRepository rhiRepository;
	
	public RhiServiceImpl(RhiRepository rhiRepository) {
		super();
		this.rhiRepository = rhiRepository;
	}

	@Override
	public Iterable<Rhi> list() {
		return this.rhiRepository.findAll();
	}

	@Override
	public Rhi create(Rhi rhi) {
		return this.rhiRepository.save(rhi);
	}

	@Override
	public Rhi read(Integer rhiId) {
		return this.rhiRepository.findOne(rhiId);
	}

	@Override
	public Rhi update(Integer rhiId, Rhi passenger) {
		Rhi rhiToUpdate = this.rhiRepository.findOne(rhiId);
		return rhiRepository.save(rhiToUpdate);
	}

	@Override
	public void delete(Integer rhiId) {
		this.rhiRepository.delete(rhiId);

	}

}
