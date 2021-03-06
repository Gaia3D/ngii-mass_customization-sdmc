package kr.ngii.pilot.sdmc.main.service.dao;

import java.util.List;

import kr.ngii.pilot.sdmc.core.annotation.DsApp;
import kr.ngii.pilot.sdmc.main.service.vo.DoyeupVO;
import kr.ngii.pilot.sdmc.main.service.vo.FormatVO;
import kr.ngii.pilot.sdmc.main.service.vo.LayerVO;
import kr.ngii.pilot.sdmc.main.service.vo.LoggerVO;
import kr.ngii.pilot.sdmc.main.service.vo.NoticeVO;
import kr.ngii.pilot.sdmc.main.service.vo.SrsVO;

@DsApp
public interface MainDao {

	public List<LayerVO> selectLayerList(LayerVO layerVO);

	public List<FormatVO> selectFormatList();

	public List<SrsVO> selectSrsList();

	public List<DoyeupVO> selectDoyeupList(String doyeupId);
	
	public void insertLog(LoggerVO log);

	public List<NoticeVO> selectNoticeList(String userId);

}
