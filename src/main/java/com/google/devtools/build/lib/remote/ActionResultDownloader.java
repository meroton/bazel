package com.google.devtools.build.lib.remote;

import build.bazel.remote.execution.v2.ActionResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.devtools.build.lib.remote.common.RemotePathResolver;

public interface ActionResultDownloader {
  public ListenableFuture<Void> downloadActionResult(ActionResult actionResult, RemotePathResolver remotePathResolver);
}
