(ns com.amazonaws.services.opsworkscm.AbstractAWSOpsWorksCMAsync
  "Abstract implementation of AWSOpsWorksCMAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.opsworkscm AbstractAWSOpsWorksCMAsync]))

(defn update-server-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.UpdateServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.UpdateServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.UpdateServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.UpdateServerRequest request]
    (-> this (.updateServerAsync request))))

(defn describe-node-association-status-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNodeAssociationStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNodeAssociationStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest request]
    (-> this (.describeNodeAssociationStatusAsync request))))

(defn disassociate-node-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DisassociateNodeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest request]
    (-> this (.disassociateNodeAsync request))))

(defn delete-server-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DeleteServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DeleteServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DeleteServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DeleteServerRequest request]
    (-> this (.deleteServerAsync request))))

(defn describe-servers-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DescribeServersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeServersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeServersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeServersRequest request]
    (-> this (.describeServersAsync request))))

(defn associate-node-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.AssociateNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.AssociateNodeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.AssociateNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.AssociateNodeRequest request]
    (-> this (.associateNodeAsync request))))

(defn start-maintenance-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartMaintenance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.StartMaintenanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startMaintenanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest request]
    (-> this (.startMaintenanceAsync request))))

(defn export-server-engine-attribute-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportServerEngineAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportServerEngineAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest request]
    (-> this (.exportServerEngineAttributeAsync request))))

(defn restore-server-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.RestoreServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.RestoreServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.RestoreServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.RestoreServerRequest request]
    (-> this (.restoreServerAsync request))))

(defn update-server-engine-attributes-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServerEngineAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServerEngineAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest request]
    (-> this (.updateServerEngineAttributesAsync request))))

(defn create-backup-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.CreateBackupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.CreateBackupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.CreateBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.CreateBackupRequest request]
    (-> this (.createBackupAsync request))))

(defn create-server-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.CreateServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.CreateServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.CreateServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.CreateServerRequest request]
    (-> this (.createServerAsync request))))

(defn describe-events-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DescribeEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request))))

(defn delete-backup-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DeleteBackupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DeleteBackupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DeleteBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DeleteBackupRequest request]
    (-> this (.deleteBackupAsync request))))

(defn describe-account-attributes-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributesAsync request))))

(defn describe-backups-async
  "Description copied from interface: AWSOpsWorksCMAsync

  request - `com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworkscm.model.DescribeBackupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSOpsWorksCMAsync this ^com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest request]
    (-> this (.describeBackupsAsync request))))

