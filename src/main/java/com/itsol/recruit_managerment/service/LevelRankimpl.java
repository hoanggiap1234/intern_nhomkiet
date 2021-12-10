package com.itsol.recruit_managerment.service;

import com.itsol.recruit_managerment.model.Level_Rank;
import com.itsol.recruit_managerment.repositories.LevelRankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LevelRankimpl implements Task<Level_Rank>{
    @Autowired
    LevelRankRepo levelRankRepo;

    @Override
    public List<Level_Rank> getAll() {
        return  levelRankRepo.findAll();
    }

    @Override
    public Level_Rank save(Level_Rank level_rank) {
        return levelRankRepo.save(level_rank);
    }

    @Override
    public Level_Rank getById(Long id) {
        return levelRankRepo.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        levelRankRepo.delete(id);
    }
}
