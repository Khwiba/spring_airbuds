package com.kdt.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kdt.domain.entity.Track;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {

	List<Track> findAllByOrderByTrackIdDesc(Pageable pageable);
}
