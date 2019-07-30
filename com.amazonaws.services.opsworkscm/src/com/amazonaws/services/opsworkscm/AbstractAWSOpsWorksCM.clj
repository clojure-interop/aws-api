(ns com.amazonaws.services.opsworkscm.AbstractAWSOpsWorksCM
  "Abstract implementation of AWSOpsWorksCM. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.opsworkscm AbstractAWSOpsWorksCM]))

(defn delete-server
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.DeleteServerRequest`

  returns: Result of the DeleteServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DeleteServerResult`"
  (^com.amazonaws.services.opsworkscm.model.DeleteServerResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DeleteServerRequest request]
    (-> this (.deleteServer request))))

(defn set-region
  "Description copied from interface: AWSOpsWorksCM

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSOpsWorksCM this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn waiters
  "returns: `com.amazonaws.services.opsworkscm.waiters.AWSOpsWorksCMWaiters`"
  (^com.amazonaws.services.opsworkscm.waiters.AWSOpsWorksCMWaiters [^AbstractAWSOpsWorksCM this]
    (-> this (.waiters))))

(defn describe-node-association-status
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest`

  returns: Result of the DescribeNodeAssociationStatus operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusResult`"
  (^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DescribeNodeAssociationStatusRequest request]
    (-> this (.describeNodeAssociationStatus request))))

(defn create-server
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.CreateServerRequest`

  returns: Result of the CreateServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.CreateServerResult`"
  (^com.amazonaws.services.opsworkscm.model.CreateServerResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.CreateServerRequest request]
    (-> this (.createServer request))))

(defn describe-backups
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest`

  returns: Result of the DescribeBackups operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeBackupsResult`"
  (^com.amazonaws.services.opsworkscm.model.DescribeBackupsResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DescribeBackupsRequest request]
    (-> this (.describeBackups request))))

(defn delete-backup
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.DeleteBackupRequest`

  returns: Result of the DeleteBackup operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DeleteBackupResult`"
  (^com.amazonaws.services.opsworkscm.model.DeleteBackupResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DeleteBackupRequest request]
    (-> this (.deleteBackup request))))

(defn describe-account-attributes
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request))))

(defn shutdown
  "Description copied from interface: AWSOpsWorksCM"
  ([^AbstractAWSOpsWorksCM this]
    (-> this (.shutdown))))

(defn describe-events
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeEventsResult`"
  (^com.amazonaws.services.opsworkscm.model.DescribeEventsResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn restore-server
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.RestoreServerRequest`

  returns: Result of the RestoreServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.RestoreServerResult`"
  (^com.amazonaws.services.opsworkscm.model.RestoreServerResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.RestoreServerRequest request]
    (-> this (.restoreServer request))))

(defn update-server
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.UpdateServerRequest`

  returns: Result of the UpdateServer operation returned by the service. - `com.amazonaws.services.opsworkscm.model.UpdateServerResult`"
  (^com.amazonaws.services.opsworkscm.model.UpdateServerResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.UpdateServerRequest request]
    (-> this (.updateServer request))))

(defn set-endpoint
  "Description copied from interface: AWSOpsWorksCM

  endpoint - The endpoint (ex: \"opsworks-cm.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"opsworks-cm.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSOpsWorksCM this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn export-server-engine-attribute
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest`

  returns: Result of the ExportServerEngineAttribute operation returned by the service. - `com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeResult`"
  (^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.ExportServerEngineAttributeRequest request]
    (-> this (.exportServerEngineAttribute request))))

(defn describe-servers
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.DescribeServersRequest`

  returns: Result of the DescribeServers operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DescribeServersResult`"
  (^com.amazonaws.services.opsworkscm.model.DescribeServersResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DescribeServersRequest request]
    (-> this (.describeServers request))))

(defn associate-node
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.AssociateNodeRequest`

  returns: Result of the AssociateNode operation returned by the service. - `com.amazonaws.services.opsworkscm.model.AssociateNodeResult`"
  (^com.amazonaws.services.opsworkscm.model.AssociateNodeResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.AssociateNodeRequest request]
    (-> this (.associateNode request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSOpsWorksCM

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSOpsWorksCM this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-server-engine-attributes
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest`

  returns: Result of the UpdateServerEngineAttributes operation returned by the service. - `com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesResult`"
  (^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.UpdateServerEngineAttributesRequest request]
    (-> this (.updateServerEngineAttributes request))))

(defn disassociate-node
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest`

  returns: Result of the DisassociateNode operation returned by the service. - `com.amazonaws.services.opsworkscm.model.DisassociateNodeResult`"
  (^com.amazonaws.services.opsworkscm.model.DisassociateNodeResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.DisassociateNodeRequest request]
    (-> this (.disassociateNode request))))

(defn start-maintenance
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest`

  returns: Result of the StartMaintenance operation returned by the service. - `com.amazonaws.services.opsworkscm.model.StartMaintenanceResult`"
  (^com.amazonaws.services.opsworkscm.model.StartMaintenanceResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.StartMaintenanceRequest request]
    (-> this (.startMaintenance request))))

(defn create-backup
  "Description copied from interface: AWSOpsWorksCM

  request - `com.amazonaws.services.opsworkscm.model.CreateBackupRequest`

  returns: Result of the CreateBackup operation returned by the service. - `com.amazonaws.services.opsworkscm.model.CreateBackupResult`"
  (^com.amazonaws.services.opsworkscm.model.CreateBackupResult [^AbstractAWSOpsWorksCM this ^com.amazonaws.services.opsworkscm.model.CreateBackupRequest request]
    (-> this (.createBackup request))))

