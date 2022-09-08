package com.quran.mobile.feature.downloadmanager.model.sheikhdownload

sealed class SuraDownloadStatusEvent {
  data class Progress(
    val progress: Int,
    val sura: Int,
    val ayah: Int,
    val downloadedAmount: Long,
    val totalAmount: Long
  ) : SuraDownloadStatusEvent()
  object Done: SuraDownloadStatusEvent()
  data class Error(val errorMessageId: Int): SuraDownloadStatusEvent()
}
