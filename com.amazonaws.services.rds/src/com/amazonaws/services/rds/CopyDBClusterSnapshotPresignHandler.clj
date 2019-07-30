(ns com.amazonaws.services.rds.CopyDBClusterSnapshotPresignHandler
  "Handler for pre-signing CopyDBClusterSnapshotRequest."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rds CopyDBClusterSnapshotPresignHandler]))

(defn ->copy-db-cluster-snapshot-presign-handler
  "Constructor."
  (^CopyDBClusterSnapshotPresignHandler []
    (new CopyDBClusterSnapshotPresignHandler )))

(defn before-request
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^CopyDBClusterSnapshotPresignHandler this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

