(ns com.amazonaws.services.redshift.AbstractAmazonRedshiftAsync
  "Abstract implementation of AmazonRedshiftAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.redshift AbstractAmazonRedshiftAsync]))

(defn modify-cluster-db-revision-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifyClusterDbRevisionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterDbRevision operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterDbRevisionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterDbRevisionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterDbRevisionRequest request]
    (-> this (.modifyClusterDbRevisionAsync request))))

(defn delete-hsm-client-certificate-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHsmClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHsmClientCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest request]
    (-> this (.deleteHsmClientCertificateAsync request))))

(defn describe-cluster-tracks-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeClusterTracksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterTracks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterTracksResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterTracksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterTracksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterTracksRequest request]
    (-> this (.describeClusterTracksAsync request))))

(defn get-cluster-credentials-async
  "Description copied from interface: AmazonRedshiftAsync

  request - The request parameters to get cluster credentials. - `com.amazonaws.services.redshift.model.GetClusterCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetClusterCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.GetClusterCredentialsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.GetClusterCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getClusterCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.GetClusterCredentialsRequest request]
    (-> this (.getClusterCredentialsAsync request))))

(defn create-cluster-snapshot-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest request]
    (-> this (.createClusterSnapshotAsync request))))

(defn describe-hsm-configurations-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHsmConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHsmConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest request]
    (-> this (.describeHsmConfigurationsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeHsmConfigurationsAsync))))

(defn enable-snapshot-copy-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableSnapshotCopy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableSnapshotCopyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest request]
    (-> this (.enableSnapshotCopyAsync request))))

(defn describe-event-categories-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeEventCategoriesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventCategoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategoriesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeEventCategoriesAsync))))

(defn create-cluster-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CreateClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterRequest request]
    (-> this (.createClusterAsync request))))

(defn delete-event-subscription-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscriptionAsync request))))

(defn revoke-snapshot-access-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeSnapshotAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeSnapshotAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest request]
    (-> this (.revokeSnapshotAccessAsync request))))

(defn delete-hsm-configuration-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHsmConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHsmConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest request]
    (-> this (.deleteHsmConfigurationAsync request))))

(defn create-snapshot-schedule-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CreateSnapshotScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.CreateSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateSnapshotScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateSnapshotScheduleRequest request]
    (-> this (.createSnapshotScheduleAsync request))))

(defn describe-default-cluster-parameters-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDefaultClusterParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DefaultClusterParameters>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDefaultClusterParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest request]
    (-> this (.describeDefaultClusterParametersAsync request))))

(defn create-hsm-configuration-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHsmConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.HsmConfiguration>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHsmConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest request]
    (-> this (.createHsmConfigurationAsync request))))

(defn describe-snapshot-schedules-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshotSchedules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotSchedulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesRequest request]
    (-> this (.describeSnapshotSchedulesAsync request))))

(defn enable-logging-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.EnableLoggingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.EnableLoggingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.EnableLoggingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableLoggingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.EnableLoggingRequest request]
    (-> this (.enableLoggingAsync request))))

(defn delete-tags-async
  "Description copied from interface: AmazonRedshiftAsync

  request - Contains the output from the DeleteTags action. - `com.amazonaws.services.redshift.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn create-snapshot-copy-grant-async
  "Description copied from interface: AmazonRedshiftAsync

  request - The result of the CreateSnapshotCopyGrant action. - `com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshotCopyGrant operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.SnapshotCopyGrant>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotCopyGrantAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest request]
    (-> this (.createSnapshotCopyGrantAsync request))))

(defn revoke-cluster-security-group-ingress-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeClusterSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterSecurityGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeClusterSecurityGroupIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest request]
    (-> this (.revokeClusterSecurityGroupIngressAsync request))))

(defn disable-snapshot-copy-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableSnapshotCopy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableSnapshotCopyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest request]
    (-> this (.disableSnapshotCopyAsync request))))

(defn modify-cluster-snapshot-schedule-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterSnapshotSchedule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterSnapshotScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleRequest request]
    (-> this (.modifyClusterSnapshotScheduleAsync request))))

(defn restore-from-cluster-snapshot-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreFromClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreFromClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest request]
    (-> this (.restoreFromClusterSnapshotAsync request))))

(defn create-cluster-security-group-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClusterSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterSecurityGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest request]
    (-> this (.createClusterSecurityGroupAsync request))))

(defn delete-cluster-snapshot-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest request]
    (-> this (.deleteClusterSnapshotAsync request))))

(defn authorize-snapshot-access-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeSnapshotAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeSnapshotAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest request]
    (-> this (.authorizeSnapshotAccessAsync request))))

(defn create-event-subscription-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscriptionAsync request))))

(defn modify-cluster-subnet-group-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterSubnetGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest request]
    (-> this (.modifyClusterSubnetGroupAsync request))))

(defn describe-hsm-client-certificates-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHsmClientCertificates operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHsmClientCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest request]
    (-> this (.describeHsmClientCertificatesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeHsmClientCertificatesAsync))))

(defn restore-table-from-cluster-snapshot-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreTableFromClusterSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.TableRestoreStatus>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreTableFromClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest request]
    (-> this (.restoreTableFromClusterSnapshotAsync request))))

(defn batch-modify-cluster-snapshots-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchModifyClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchModifyClusterSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsRequest request]
    (-> this (.batchModifyClusterSnapshotsAsync request))))

(defn describe-storage-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeStorageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStorage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeStorageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeStorageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStorageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeStorageRequest request]
    (-> this (.describeStorageAsync request))))

(defn delete-cluster-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DeleteClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterRequest request]
    (-> this (.deleteClusterAsync request))))

(defn create-hsm-client-certificate-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHsmClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.HsmClientCertificate>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHsmClientCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest request]
    (-> this (.createHsmClientCertificateAsync request))))

(defn resize-cluster-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ResizeClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResizeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ResizeClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resizeClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ResizeClusterRequest request]
    (-> this (.resizeClusterAsync request))))

(defn describe-resize-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeResizeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResize operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeResizeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeResizeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResizeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeResizeRequest request]
    (-> this (.describeResizeAsync request))))

(defn describe-clusters-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClustersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClustersRequest request]
    (-> this (.describeClustersAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeClustersAsync))))

(defn describe-cluster-security-groups-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterSecurityGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest request]
    (-> this (.describeClusterSecurityGroupsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeClusterSecurityGroupsAsync))))

(defn get-reserved-node-exchange-offerings-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReservedNodeExchangeOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReservedNodeExchangeOfferingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsRequest request]
    (-> this (.getReservedNodeExchangeOfferingsAsync request))))

(defn describe-reserved-nodes-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeReservedNodesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedNodes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeReservedNodesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeReservedNodesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedNodesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeReservedNodesRequest request]
    (-> this (.describeReservedNodesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeReservedNodesAsync))))

(defn describe-cluster-db-revisions-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterDbRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterDbRevisionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsRequest request]
    (-> this (.describeClusterDbRevisionsAsync request))))

(defn delete-cluster-parameter-group-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest request]
    (-> this (.deleteClusterParameterGroupAsync request))))

(defn modify-cluster-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifyClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterRequest request]
    (-> this (.modifyClusterAsync request))))

(defn modify-cluster-iam-roles-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterIamRoles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterIamRolesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest request]
    (-> this (.modifyClusterIamRolesAsync request))))

(defn describe-logging-status-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoggingStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeLoggingStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoggingStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest request]
    (-> this (.describeLoggingStatusAsync request))))

(defn purchase-reserved-node-offering-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseReservedNodeOffering operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ReservedNode>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseReservedNodeOfferingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest request]
    (-> this (.purchaseReservedNodeOfferingAsync request))))

(defn reset-cluster-parameter-group-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest request]
    (-> this (.resetClusterParameterGroupAsync request))))

(defn delete-cluster-security-group-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClusterSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest request]
    (-> this (.deleteClusterSecurityGroupAsync request))))

(defn describe-table-restore-status-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTableRestoreStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTableRestoreStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest request]
    (-> this (.describeTableRestoreStatusAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeTableRestoreStatusAsync))))

(defn cancel-resize-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CancelResizeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelResize operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.CancelResizeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CancelResizeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelResizeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CancelResizeRequest request]
    (-> this (.cancelResizeAsync request))))

(defn describe-cluster-parameters-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeClusterParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterParametersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterParametersRequest request]
    (-> this (.describeClusterParametersAsync request))))

(defn create-tags-async
  "Description copied from interface: AmazonRedshiftAsync

  request - Contains the output from the CreateTags action. - `com.amazonaws.services.redshift.model.CreateTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateTagsRequest request]
    (-> this (.createTagsAsync request))))

(defn accept-reserved-node-exchange-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.AcceptReservedNodeExchangeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptReservedNodeExchange operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ReservedNode>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AcceptReservedNodeExchangeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptReservedNodeExchangeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AcceptReservedNodeExchangeRequest request]
    (-> this (.acceptReservedNodeExchangeAsync request))))

(defn disable-logging-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DisableLoggingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DisableLoggingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DisableLoggingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableLoggingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DisableLoggingRequest request]
    (-> this (.disableLoggingAsync request))))

(defn delete-cluster-subnet-group-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClusterSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest request]
    (-> this (.deleteClusterSubnetGroupAsync request))))

(defn describe-event-subscriptions-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSubscriptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptionsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeEventSubscriptionsAsync))))

(defn copy-cluster-snapshot-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest request]
    (-> this (.copyClusterSnapshotAsync request))))

(defn describe-cluster-subnet-groups-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterSubnetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest request]
    (-> this (.describeClusterSubnetGroupsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeClusterSubnetGroupsAsync))))

(defn modify-snapshot-copy-retention-period-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifySnapshotCopyRetentionPeriod operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifySnapshotCopyRetentionPeriodAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest request]
    (-> this (.modifySnapshotCopyRetentionPeriodAsync request))))

(defn describe-snapshot-copy-grants-async
  "Description copied from interface: AmazonRedshiftAsync

  request - The result of the DescribeSnapshotCopyGrants action. - `com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshotCopyGrants operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotCopyGrantsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest request]
    (-> this (.describeSnapshotCopyGrantsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeSnapshotCopyGrantsAsync))))

(defn delete-snapshot-copy-grant-async
  "Description copied from interface: AmazonRedshiftAsync

  request - The result of the DeleteSnapshotCopyGrant action. - `com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshotCopyGrant operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotCopyGrantAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest request]
    (-> this (.deleteSnapshotCopyGrantAsync request))))

(defn rotate-encryption-key-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RotateEncryptionKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rotateEncryptionKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest request]
    (-> this (.rotateEncryptionKeyAsync request))))

(defn batch-delete-cluster-snapshots-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteClusterSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsRequest request]
    (-> this (.batchDeleteClusterSnapshotsAsync request))))

(defn describe-events-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeEventsAsync))))

(defn describe-cluster-versions-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest request]
    (-> this (.describeClusterVersionsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeClusterVersionsAsync))))

(defn describe-tags-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeTagsAsync))))

(defn create-cluster-subnet-group-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClusterSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterSubnetGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest request]
    (-> this (.createClusterSubnetGroupAsync request))))

(defn describe-cluster-parameter-groups-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterParameterGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterParameterGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest request]
    (-> this (.describeClusterParameterGroupsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeClusterParameterGroupsAsync))))

(defn reboot-cluster-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.RebootClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RebootClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RebootClusterRequest request]
    (-> this (.rebootClusterAsync request))))

(defn modify-cluster-maintenance-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifyClusterMaintenanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterMaintenance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterMaintenanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterMaintenanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterMaintenanceRequest request]
    (-> this (.modifyClusterMaintenanceAsync request))))

(defn describe-cluster-snapshots-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest request]
    (-> this (.describeClusterSnapshotsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeClusterSnapshotsAsync))))

(defn authorize-cluster-security-group-ingress-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeClusterSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterSecurityGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeClusterSecurityGroupIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest request]
    (-> this (.authorizeClusterSecurityGroupIngressAsync request))))

(defn modify-cluster-snapshot-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifyClusterSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotRequest request]
    (-> this (.modifyClusterSnapshotAsync request))))

(defn create-cluster-parameter-group-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest request]
    (-> this (.createClusterParameterGroupAsync request))))

(defn delete-snapshot-schedule-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DeleteSnapshotScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteSnapshotScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteSnapshotScheduleRequest request]
    (-> this (.deleteSnapshotScheduleAsync request))))

(defn modify-cluster-parameter-group-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest request]
    (-> this (.modifyClusterParameterGroupAsync request))))

(defn describe-orderable-cluster-options-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrderableClusterOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrderableClusterOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest request]
    (-> this (.describeOrderableClusterOptionsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeOrderableClusterOptionsAsync))))

(defn describe-reserved-node-offerings-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedNodeOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedNodeOfferingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest request]
    (-> this (.describeReservedNodeOfferingsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this]
    (-> this (.describeReservedNodeOfferingsAsync))))

(defn modify-event-subscription-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscriptionAsync request))))

(defn describe-account-attributes-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.DescribeAccountAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeAccountAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributesAsync request))))

(defn modify-snapshot-schedule-async
  "Description copied from interface: AmazonRedshiftAsync

  request - `com.amazonaws.services.redshift.model.ModifySnapshotScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifySnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ModifySnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifySnapshotScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifySnapshotScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifySnapshotScheduleRequest request]
    (-> this (.modifySnapshotScheduleAsync request))))

