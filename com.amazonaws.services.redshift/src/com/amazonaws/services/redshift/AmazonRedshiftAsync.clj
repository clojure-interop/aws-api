(ns com.amazonaws.services.redshift.AmazonRedshiftAsync
  "Interface for accessing Amazon Redshift asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonRedshiftAsync instead.


  Amazon Redshift

  Overview


  This is an interface reference for Amazon Redshift. It contains documentation for one of the programming or command
  line interfaces you can use to manage Amazon Redshift clusters. Note that Amazon Redshift is asynchronous, which
  means that some interfaces may require techniques, such as polling or asynchronous callback handlers, to determine
  when a command has been applied. In this reference, the parameter descriptions indicate whether a change is applied
  immediately, on the next instance reboot, or during the next maintenance window. For a summary of the Amazon Redshift
  cluster management interfaces, go to Using the Amazon Redshift Management
  Interfaces.


  Amazon Redshift manages all the work of setting up, operating, and scaling a data warehouse: provisioning capacity,
  monitoring and backing up the cluster, and applying patches and upgrades to the Amazon Redshift engine. You can focus
  on using your data to acquire new insights for your business and customers.


  If you are a first-time user of Amazon Redshift, we recommend that you begin by reading the Amazon Redshift Getting Started
  Guide.


  If you are a database developer, the Amazon
  Redshift Database Developer Guide explains how to design, build, query, and maintain the databases that make up
  your data warehouse."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.redshift AmazonRedshiftAsync]))

(defn modify-cluster-db-revision-async
  "Modifies the database revision of a cluster. The database revision is a unique revision of the database running
   in a cluster.

  modify-cluster-db-revision-request - `com.amazonaws.services.redshift.model.ModifyClusterDbRevisionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterDbRevision operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterDbRevisionRequest modify-cluster-db-revision-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterDbRevisionAsync modify-cluster-db-revision-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterDbRevisionRequest modify-cluster-db-revision-request]
    (-> this (.modifyClusterDbRevisionAsync modify-cluster-db-revision-request))))

(defn delete-hsm-client-certificate-async
  "Deletes the specified HSM client certificate.

  delete-hsm-client-certificate-request - `com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHsmClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteHsmClientCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest delete-hsm-client-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHsmClientCertificateAsync delete-hsm-client-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteHsmClientCertificateRequest delete-hsm-client-certificate-request]
    (-> this (.deleteHsmClientCertificateAsync delete-hsm-client-certificate-request))))

(defn describe-cluster-tracks-async
  "Returns a list of all the available maintenance tracks.

  describe-cluster-tracks-request - `com.amazonaws.services.redshift.model.DescribeClusterTracksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterTracks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterTracksResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterTracksRequest describe-cluster-tracks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterTracksAsync describe-cluster-tracks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterTracksRequest describe-cluster-tracks-request]
    (-> this (.describeClusterTracksAsync describe-cluster-tracks-request))))

(defn get-cluster-credentials-async
  "Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift
   database. The action returns the database user name prefixed with IAM: if AutoCreate is
   False or IAMA: if AutoCreate is True. You can optionally
   specify one or more database user groups that the user will join at log on. By default, the temporary credentials
   expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds
   (60 minutes). For more information, see Using IAM Authentication
   to Generate Database User Credentials in the Amazon Redshift Cluster Management Guide.


   The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM
   policy attached that allows access to all necessary actions and resources. For more information about
   permissions, see Resource Policies for GetClusterCredentials in the Amazon Redshift Cluster Management Guide.


   If the DbGroups parameter is specified, the IAM policy must allow the
   redshift:JoinGroup action with access to the listed dbgroups.


   In addition, if the AutoCreate parameter is set to True, then the policy must include
   the redshift:CreateClusterUser privilege.


   If the DbName parameter is specified, the IAM policy must allow access to the resource
   dbname for the specified database name.

  get-cluster-credentials-request - The request parameters to get cluster credentials. - `com.amazonaws.services.redshift.model.GetClusterCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetClusterCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.GetClusterCredentialsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.GetClusterCredentialsRequest get-cluster-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getClusterCredentialsAsync get-cluster-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.GetClusterCredentialsRequest get-cluster-credentials-request]
    (-> this (.getClusterCredentialsAsync get-cluster-credentials-request))))

(defn create-cluster-snapshot-async
  "Creates a manual snapshot of the specified cluster. The cluster must be in the available state.


   For more information about working with snapshots, go to Amazon Redshift Snapshots
   in the Amazon Redshift Cluster Management Guide.

  create-cluster-snapshot-request - `com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest create-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterSnapshotAsync create-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSnapshotRequest create-cluster-snapshot-request]
    (-> this (.createClusterSnapshotAsync create-cluster-snapshot-request))))

(defn describe-hsm-configurations-async
  "Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified,
   returns information about all the HSM configurations owned by your AWS customer account.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that
   match any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all HSM
   connections that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they
   have tag keys or values associated with them.

  describe-hsm-configurations-request - `com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHsmConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeHsmConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest describe-hsm-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHsmConfigurationsAsync describe-hsm-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeHsmConfigurationsRequest describe-hsm-configurations-request]
    (-> this (.describeHsmConfigurationsAsync describe-hsm-configurations-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeHsmConfigurationsAsync))))

(defn enable-snapshot-copy-async
  "Enables the automatic copy of snapshots from one region to another region for a specified cluster.

  enable-snapshot-copy-request - `com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableSnapshotCopy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest enable-snapshot-copy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableSnapshotCopyAsync enable-snapshot-copy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.EnableSnapshotCopyRequest enable-snapshot-copy-request]
    (-> this (.enableSnapshotCopyAsync enable-snapshot-copy-request))))

(defn describe-event-categories-async
  "Displays a list of event categories for all event source types, or for a specified source type. For a list of the
   event categories and source types, go to Amazon Redshift
   Event Notifications.

  describe-event-categories-request - `com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeEventCategoriesResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest describe-event-categories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventCategoriesAsync describe-event-categories-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventCategoriesRequest describe-event-categories-request]
    (-> this (.describeEventCategoriesAsync describe-event-categories-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeEventCategoriesAsync))))

(defn create-cluster-async
  "Creates a new cluster.


   To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster
   subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more
   information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.

  create-cluster-request - `com.amazonaws.services.redshift.model.CreateClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterRequest create-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync create-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterRequest create-cluster-request]
    (-> this (.createClusterAsync create-cluster-request))))

(defn delete-event-subscription-async
  "Deletes an Amazon Redshift event notification subscription.

  delete-event-subscription-request - `com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteEventSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest delete-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventSubscriptionAsync delete-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteEventSubscriptionRequest delete-event-subscription-request]
    (-> this (.deleteEventSubscriptionAsync delete-event-subscription-request))))

(defn revoke-snapshot-access-async
  "Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is
   currently restoring the snapshot, the restore will run to completion.


   For more information about working with snapshots, go to Amazon Redshift Snapshots
   in the Amazon Redshift Cluster Management Guide.

  revoke-snapshot-access-request - `com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeSnapshotAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest revoke-snapshot-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeSnapshotAccessAsync revoke-snapshot-access-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RevokeSnapshotAccessRequest revoke-snapshot-access-request]
    (-> this (.revokeSnapshotAccessAsync revoke-snapshot-access-request))))

(defn delete-hsm-configuration-async
  "Deletes the specified Amazon Redshift HSM configuration.

  delete-hsm-configuration-request - `com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHsmConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteHsmConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest delete-hsm-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHsmConfigurationAsync delete-hsm-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteHsmConfigurationRequest delete-hsm-configuration-request]
    (-> this (.deleteHsmConfigurationAsync delete-hsm-configuration-request))))

(defn create-snapshot-schedule-async
  "Creates a new snapshot schedule.

  create-snapshot-schedule-request - `com.amazonaws.services.redshift.model.CreateSnapshotScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.CreateSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateSnapshotScheduleRequest create-snapshot-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotScheduleAsync create-snapshot-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateSnapshotScheduleRequest create-snapshot-schedule-request]
    (-> this (.createSnapshotScheduleAsync create-snapshot-schedule-request))))

(defn describe-default-cluster-parameters-async
  "Returns a list of parameter settings for the specified parameter group family.


   For more information about parameters and parameter groups, go to Amazon Redshift
   Parameter Groups in the Amazon Redshift Cluster Management Guide.

  describe-default-cluster-parameters-request - `com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDefaultClusterParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DefaultClusterParameters>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest describe-default-cluster-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDefaultClusterParametersAsync describe-default-cluster-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeDefaultClusterParametersRequest describe-default-cluster-parameters-request]
    (-> this (.describeDefaultClusterParametersAsync describe-default-cluster-parameters-request))))

(defn create-hsm-configuration-async
  "Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and
   use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can
   specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM.


   In addition to creating an HSM configuration, you must also create an HSM client certificate. For more
   information, go to Hardware
   Security Modules in the Amazon Redshift Cluster Management Guide.

  create-hsm-configuration-request - `com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHsmConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.HsmConfiguration>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest create-hsm-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHsmConfigurationAsync create-hsm-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateHsmConfigurationRequest create-hsm-configuration-request]
    (-> this (.createHsmConfigurationAsync create-hsm-configuration-request))))

(defn describe-snapshot-schedules-async
  "Returns a list of snapshot schedules.

  describe-snapshot-schedules-request - `com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshotSchedules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesRequest describe-snapshot-schedules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotSchedulesAsync describe-snapshot-schedules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeSnapshotSchedulesRequest describe-snapshot-schedules-request]
    (-> this (.describeSnapshotSchedulesAsync describe-snapshot-schedules-request))))

(defn enable-logging-async
  "Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.

  enable-logging-request - `com.amazonaws.services.redshift.model.EnableLoggingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.EnableLoggingResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.EnableLoggingRequest enable-logging-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableLoggingAsync enable-logging-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.EnableLoggingRequest enable-logging-request]
    (-> this (.enableLoggingAsync enable-logging-request))))

(defn delete-tags-async
  "Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the
   tag or tags.

  delete-tags-request - Contains the output from the DeleteTags action. - `com.amazonaws.services.redshift.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteTagsRequest delete-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync delete-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTagsAsync delete-tags-request))))

(defn create-snapshot-copy-grant-async
  "Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key
   Management Service (AWS KMS) to encrypt copied snapshots in a destination region.


   For more information about managing snapshot copy grants, go to Amazon Redshift Database
   Encryption in the Amazon Redshift Cluster Management Guide.

  create-snapshot-copy-grant-request - The result of the CreateSnapshotCopyGrant action. - `com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshotCopyGrant operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.SnapshotCopyGrant>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest create-snapshot-copy-grant-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotCopyGrantAsync create-snapshot-copy-grant-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateSnapshotCopyGrantRequest create-snapshot-copy-grant-request]
    (-> this (.createSnapshotCopyGrantAsync create-snapshot-copy-grant-request))))

(defn revoke-cluster-security-group-ingress-async
  "Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2
   security group. To add an ingress rule, see AuthorizeClusterSecurityGroupIngress. For information about
   managing security groups, go to Amazon Redshift Cluster
   Security Groups in the Amazon Redshift Cluster Management Guide.

  revoke-cluster-security-group-ingress-request - `com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeClusterSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest revoke-cluster-security-group-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeClusterSecurityGroupIngressAsync revoke-cluster-security-group-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RevokeClusterSecurityGroupIngressRequest revoke-cluster-security-group-ingress-request]
    (-> this (.revokeClusterSecurityGroupIngressAsync revoke-cluster-security-group-ingress-request))))

(defn disable-snapshot-copy-async
  "Disables the automatic copying of snapshots from one region to another region for a specified cluster.


   If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use
   DeleteSnapshotCopyGrant to delete the grant that grants Amazon Redshift permission to the CMK in the
   destination region.

  disable-snapshot-copy-request - `com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableSnapshotCopy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest disable-snapshot-copy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableSnapshotCopyAsync disable-snapshot-copy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DisableSnapshotCopyRequest disable-snapshot-copy-request]
    (-> this (.disableSnapshotCopyAsync disable-snapshot-copy-request))))

(defn modify-cluster-snapshot-schedule-async
  "Modifies a snapshot schedule for a cluster.

  modify-cluster-snapshot-schedule-request - `com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterSnapshotSchedule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleRequest modify-cluster-snapshot-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterSnapshotScheduleAsync modify-cluster-snapshot-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotScheduleRequest modify-cluster-snapshot-schedule-request]
    (-> this (.modifyClusterSnapshotScheduleAsync modify-cluster-snapshot-schedule-request))))

(defn restore-from-cluster-snapshot-async
  "Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same
   configuration as the original cluster from which the snapshot was created, except that the new cluster is created
   with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use
   the ModifyCluster API to associate a different security group and different parameter group with the
   restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the
   same size during restore.


   If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.


   For more information about working with snapshots, go to Amazon Redshift Snapshots
   in the Amazon Redshift Cluster Management Guide.

  restore-from-cluster-snapshot-request - `com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreFromClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest restore-from-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreFromClusterSnapshotAsync restore-from-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RestoreFromClusterSnapshotRequest restore-from-cluster-snapshot-request]
    (-> this (.restoreFromClusterSnapshotAsync restore-from-cluster-snapshot-request))))

(defn create-cluster-security-group-async
  "Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.


   For information about managing security groups, go to Amazon Redshift Cluster
   Security Groups in the Amazon Redshift Cluster Management Guide.

  create-cluster-security-group-request - `com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClusterSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest create-cluster-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterSecurityGroupAsync create-cluster-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSecurityGroupRequest create-cluster-security-group-request]
    (-> this (.createClusterSecurityGroupAsync create-cluster-security-group-request))))

(defn delete-cluster-snapshot-async
  "Deletes the specified manual snapshot. The snapshot must be in the available state, with no other
   users authorized to access the snapshot.


   Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift
   does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If
   other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can
   delete the snapshot.

  delete-cluster-snapshot-request - `com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest delete-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterSnapshotAsync delete-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSnapshotRequest delete-cluster-snapshot-request]
    (-> this (.deleteClusterSnapshotAsync delete-cluster-snapshot-request))))

(defn authorize-snapshot-access-async
  "Authorizes the specified AWS customer account to restore the specified snapshot.


   For more information about working with snapshots, go to Amazon Redshift Snapshots
   in the Amazon Redshift Cluster Management Guide.

  authorize-snapshot-access-request - `com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeSnapshotAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest authorize-snapshot-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeSnapshotAccessAsync authorize-snapshot-access-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AuthorizeSnapshotAccessRequest authorize-snapshot-access-request]
    (-> this (.authorizeSnapshotAccessAsync authorize-snapshot-access-request))))

(defn create-event-subscription-async
  "Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of
   an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API.
   To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is
   displayed in the SNS console.


   You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities.
   Notifications will be sent for all events you want that match those criteria. For example, you can specify source
   type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity =
   ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup
   categories for the specified clusters.


   If you specify both the source type and source IDs, such as source type = cluster and source identifier =
   my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source
   type but do not specify a source identifier, you will receive notice of the events for the objects of that type
   in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified
   of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source
   type if you specify a source ID.

  create-event-subscription-request - `com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest create-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventSubscriptionAsync create-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateEventSubscriptionRequest create-event-subscription-request]
    (-> this (.createEventSubscriptionAsync create-event-subscription-request))))

(defn modify-cluster-subnet-group-async
  "Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing
   list of subnets with the new list of subnets.

  modify-cluster-subnet-group-request - `com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest modify-cluster-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterSubnetGroupAsync modify-cluster-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSubnetGroupRequest modify-cluster-subnet-group-request]
    (-> this (.modifyClusterSubnetGroupAsync modify-cluster-subnet-group-request))))

(defn describe-hsm-client-certificates-async
  "Returns information about the specified HSM client certificate. If no certificate ID is specified, returns
   information about all the HSM certificates owned by your AWS customer account.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client
   certificates that match any combination of the specified keys and values. For example, if you have
   owner and environment for tag keys, and admin and test for
   tag values, all HSM client certificates that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of
   whether they have tag keys or values associated with them.

  describe-hsm-client-certificates-request - `com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHsmClientCertificates operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest describe-hsm-client-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHsmClientCertificatesAsync describe-hsm-client-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeHsmClientCertificatesRequest describe-hsm-client-certificates-request]
    (-> this (.describeHsmClientCertificatesAsync describe-hsm-client-certificates-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeHsmClientCertificatesAsync))))

(defn restore-table-from-cluster-snapshot-async
  "Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the
   Amazon Redshift cluster that the snapshot was taken from.


   You cannot use RestoreTableFromClusterSnapshot to restore a table with the same name as an existing
   table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored
   table. If you want to replace your original table with a new, restored table, then rename or drop your original
   table before you call RestoreTableFromClusterSnapshot. When you have renamed your original table,
   then you can pass the original name of the table as the NewTableName parameter value in the call to
   RestoreTableFromClusterSnapshot. This way, you can replace the original table with the table created
   from the snapshot.

  restore-table-from-cluster-snapshot-request - `com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreTableFromClusterSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.TableRestoreStatus>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest restore-table-from-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreTableFromClusterSnapshotAsync restore-table-from-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RestoreTableFromClusterSnapshotRequest restore-table-from-cluster-snapshot-request]
    (-> this (.restoreTableFromClusterSnapshotAsync restore-table-from-cluster-snapshot-request))))

(defn batch-modify-cluster-snapshots-async
  "Modifies the settings for a list of snapshots.

  batch-modify-cluster-snapshots-request - `com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchModifyClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsRequest batch-modify-cluster-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchModifyClusterSnapshotsAsync batch-modify-cluster-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.BatchModifyClusterSnapshotsRequest batch-modify-cluster-snapshots-request]
    (-> this (.batchModifyClusterSnapshotsAsync batch-modify-cluster-snapshots-request))))

(defn describe-storage-async
  "Returns the total amount of snapshot usage and provisioned storage for a user in megabytes.

  describe-storage-request - `com.amazonaws.services.redshift.model.DescribeStorageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStorage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeStorageResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeStorageRequest describe-storage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStorageAsync describe-storage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeStorageRequest describe-storage-request]
    (-> this (.describeStorageAsync describe-storage-request))))

(defn delete-cluster-async
  "Deletes a previously provisioned cluster. A successful response from the web service indicates that the request
   was received correctly. Use DescribeClusters to monitor the status of the deletion. The delete operation
   cannot be canceled or reverted once submitted. For more information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.


   If you want to shut down the cluster and retain it for future use, set SkipFinalClusterSnapshot to
   false and specify a name for FinalClusterSnapshotIdentifier. You can later restore this
   snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be
   \"final-snapshot\" while the snapshot is being taken, then it's \"deleting\" once Amazon Redshift begins deleting the
   cluster.


   For more information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.

  delete-cluster-request - `com.amazonaws.services.redshift.model.DeleteClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterRequest delete-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync delete-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterRequest delete-cluster-request]
    (-> this (.deleteClusterAsync delete-cluster-request))))

(defn create-hsm-client-certificate-async
  "Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in
   order to store and retrieve the keys used to encrypt the cluster databases.


   The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate,
   you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and
   use encryption keys in the HSM. For more information, go to Hardware Security Modules in
   the Amazon Redshift Cluster Management Guide.

  create-hsm-client-certificate-request - `com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHsmClientCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.HsmClientCertificate>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest create-hsm-client-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHsmClientCertificateAsync create-hsm-client-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateHsmClientCertificateRequest create-hsm-client-certificate-request]
    (-> this (.createHsmClientCertificateAsync create-hsm-client-certificate-request))))

(defn resize-cluster-async
  "Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The
   default behavior is to use the elastic resize method. With an elastic resize, your cluster is available for read
   and write operations more quickly than with the classic resize method.


   Elastic resize operations have the following restrictions:




   You can only resize clusters of the following types:




   dc2.large




   dc2.8xlarge




   ds2.xlarge




   ds2.8xlarge






   The type of nodes that you add must match the node type for the cluster.

  resize-cluster-request - `com.amazonaws.services.redshift.model.ResizeClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResizeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ResizeClusterRequest resize-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resizeClusterAsync resize-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ResizeClusterRequest resize-cluster-request]
    (-> this (.resizeClusterAsync resize-cluster-request))))

(defn describe-resize-async
  "Returns information about the last resize operation for the specified cluster. If no resize operation has ever
   been initiated for the specified cluster, a HTTP 404 error is returned. If a resize operation was
   initiated and completed, the status of the resize remains as SUCCEEDED until the next resize.


   A resize operation can be requested using ModifyCluster and specifying a different number or type of nodes
   for the cluster.

  describe-resize-request - `com.amazonaws.services.redshift.model.DescribeResizeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResize operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeResizeResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeResizeRequest describe-resize-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResizeAsync describe-resize-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeResizeRequest describe-resize-request]
    (-> this (.describeResizeAsync describe-resize-request))))

(defn describe-clusters-async
  "Returns properties of provisioned clusters including general cluster properties, cluster database properties,
   maintenance and backup properties, and security and access properties. This operation supports pagination. For
   more information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match
   any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all clusters
   that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have
   tag keys or values associated with them.

  describe-clusters-request - `com.amazonaws.services.redshift.model.DescribeClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClustersResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClustersRequest describe-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClustersAsync describe-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClustersRequest describe-clusters-request]
    (-> this (.describeClustersAsync describe-clusters-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeClustersAsync))))

(defn describe-cluster-security-groups-async
  "Returns information about Amazon Redshift security groups. If the name of a security group is specified, the
   response will contain only information about only that security group.


   For information about managing security groups, go to Amazon Redshift Cluster
   Security Groups in the Amazon Redshift Cluster Management Guide.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that
   match any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all security
   groups that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, security groups are returned regardless of whether they
   have tag keys or values associated with them.

  describe-cluster-security-groups-request - `com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterSecurityGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest describe-cluster-security-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterSecurityGroupsAsync describe-cluster-security-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSecurityGroupsRequest describe-cluster-security-groups-request]
    (-> this (.describeClusterSecurityGroupsAsync describe-cluster-security-groups-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeClusterSecurityGroupsAsync))))

(defn get-reserved-node-exchange-offerings-async
  "Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given
   DC1 reserved node.

  get-reserved-node-exchange-offerings-request - `com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReservedNodeExchangeOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsRequest get-reserved-node-exchange-offerings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReservedNodeExchangeOfferingsAsync get-reserved-node-exchange-offerings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.GetReservedNodeExchangeOfferingsRequest get-reserved-node-exchange-offerings-request]
    (-> this (.getReservedNodeExchangeOfferingsAsync get-reserved-node-exchange-offerings-request))))

(defn describe-reserved-nodes-async
  "Returns the descriptions of the reserved nodes.

  describe-reserved-nodes-request - `com.amazonaws.services.redshift.model.DescribeReservedNodesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedNodes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeReservedNodesResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeReservedNodesRequest describe-reserved-nodes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedNodesAsync describe-reserved-nodes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeReservedNodesRequest describe-reserved-nodes-request]
    (-> this (.describeReservedNodesAsync describe-reserved-nodes-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeReservedNodesAsync))))

(defn describe-cluster-db-revisions-async
  "Returns an array of ClusterDbRevision objects.

  describe-cluster-db-revisions-request - `com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterDbRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsRequest describe-cluster-db-revisions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterDbRevisionsAsync describe-cluster-db-revisions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterDbRevisionsRequest describe-cluster-db-revisions-request]
    (-> this (.describeClusterDbRevisionsAsync describe-cluster-db-revisions-request))))

(defn delete-cluster-parameter-group-async
  "Deletes a specified Amazon Redshift parameter group.



   You cannot delete a parameter group if it is associated with a cluster.

  delete-cluster-parameter-group-request - `com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest delete-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterParameterGroupAsync delete-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterParameterGroupRequest delete-cluster-parameter-group-request]
    (-> this (.deleteClusterParameterGroupAsync delete-cluster-parameter-group-request))))

(defn modify-cluster-async
  "Modifies the settings for a cluster. For example, you can add another security or parameter group, update the
   preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the
   security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a
   reboot for parameters to take effect. For more information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.


   You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster,
   you must specify both the number of nodes and the node type even if one of the parameters does not change.

  modify-cluster-request - `com.amazonaws.services.redshift.model.ModifyClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterRequest modify-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterAsync modify-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterRequest modify-cluster-request]
    (-> this (.modifyClusterAsync modify-cluster-request))))

(defn modify-cluster-iam-roles-async
  "Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access
   other AWS services.


   A cluster can have up to 10 IAM roles associated at any time.

  modify-cluster-iam-roles-request - `com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterIamRoles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest modify-cluster-iam-roles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterIamRolesAsync modify-cluster-iam-roles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterIamRolesRequest modify-cluster-iam-roles-request]
    (-> this (.modifyClusterIamRolesAsync modify-cluster-iam-roles-request))))

(defn describe-logging-status-async
  "Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon
   Redshift cluster.

  describe-logging-status-request - `com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoggingStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeLoggingStatusResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest describe-logging-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoggingStatusAsync describe-logging-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeLoggingStatusRequest describe-logging-status-request]
    (-> this (.describeLoggingStatusAsync describe-logging-status-request))))

(defn purchase-reserved-node-offering-async
  "Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You
   can purchase one or more of the offerings. You can call the DescribeReservedNodeOfferings API to obtain
   the available reserved node offerings. You can call this API by providing a specific reserved node offering and
   the number of nodes you want to reserve.


   For more information about reserved node offerings, go to Purchasing Reserved
   Nodes in the Amazon Redshift Cluster Management Guide.

  purchase-reserved-node-offering-request - `com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseReservedNodeOffering operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ReservedNode>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest purchase-reserved-node-offering-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseReservedNodeOfferingAsync purchase-reserved-node-offering-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.PurchaseReservedNodeOfferingRequest purchase-reserved-node-offering-request]
    (-> this (.purchaseReservedNodeOfferingAsync purchase-reserved-node-offering-request))))

(defn reset-cluster-parameter-group-async
  "Sets one or more parameters of the specified parameter group to their default values and sets the source values
   of the parameters to \"engine-default\". To reset the entire parameter group specify the ResetAllParameters
   parameter. For parameter changes to take effect you must reboot any associated clusters.

  reset-cluster-parameter-group-request - `com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ResetClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest reset-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetClusterParameterGroupAsync reset-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ResetClusterParameterGroupRequest reset-cluster-parameter-group-request]
    (-> this (.resetClusterParameterGroupAsync reset-cluster-parameter-group-request))))

(defn delete-cluster-security-group-async
  "Deletes an Amazon Redshift security group.



   You cannot delete a security group that is associated with any clusters. You cannot delete the default security
   group.



   For information about managing security groups, go to Amazon Redshift Cluster
   Security Groups in the Amazon Redshift Cluster Management Guide.

  delete-cluster-security-group-request - `com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClusterSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest delete-cluster-security-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterSecurityGroupAsync delete-cluster-security-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSecurityGroupRequest delete-cluster-security-group-request]
    (-> this (.deleteClusterSecurityGroupAsync delete-cluster-security-group-request))))

(defn describe-table-restore-status-async
  "Lists the status of one or more table restore requests made using the RestoreTableFromClusterSnapshot API
   action. If you don't specify a value for the TableRestoreRequestId parameter, then
   DescribeTableRestoreStatus returns the status of all table restore requests ordered by the date and
   time of the request in ascending order. Otherwise DescribeTableRestoreStatus returns the status of
   the table specified by TableRestoreRequestId.

  describe-table-restore-status-request - `com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTableRestoreStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeTableRestoreStatusResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest describe-table-restore-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTableRestoreStatusAsync describe-table-restore-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeTableRestoreStatusRequest describe-table-restore-status-request]
    (-> this (.describeTableRestoreStatusAsync describe-table-restore-status-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeTableRestoreStatusAsync))))

(defn cancel-resize-async
  "Cancels a resize operation.

  cancel-resize-request - `com.amazonaws.services.redshift.model.CancelResizeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelResize operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.CancelResizeResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CancelResizeRequest cancel-resize-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelResizeAsync cancel-resize-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CancelResizeRequest cancel-resize-request]
    (-> this (.cancelResizeAsync cancel-resize-request))))

(defn describe-cluster-parameters-async
  "Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each
   parameter the response includes information such as parameter name, description, data type, value, whether the
   parameter value is modifiable, and so on.


   You can specify source filter to retrieve parameters of only specific type. For example, to retrieve
   parameters that were modified by a user action such as from ModifyClusterParameterGroup, you can specify
   source equal to user.


   For more information about parameters and parameter groups, go to Amazon Redshift
   Parameter Groups in the Amazon Redshift Cluster Management Guide.

  describe-cluster-parameters-request - `com.amazonaws.services.redshift.model.DescribeClusterParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterParametersResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterParametersRequest describe-cluster-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterParametersAsync describe-cluster-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterParametersRequest describe-cluster-parameters-request]
    (-> this (.describeClusterParametersAsync describe-cluster-parameters-request))))

(defn create-tags-async
  "Adds one or more tags to a specified resource.


   A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an
   error and the attempt will fail.


   If you specify a key that already exists for the resource, the value for that key will be updated with the new
   value.

  create-tags-request - Contains the output from the CreateTags action. - `com.amazonaws.services.redshift.model.CreateTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateTagsRequest create-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync create-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateTagsRequest create-tags-request]
    (-> this (.createTagsAsync create-tags-request))))

(defn accept-reserved-node-exchange-async
  "Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type,
   or number of nodes) and no additional costs.

  accept-reserved-node-exchange-request - `com.amazonaws.services.redshift.model.AcceptReservedNodeExchangeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptReservedNodeExchange operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ReservedNode>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AcceptReservedNodeExchangeRequest accept-reserved-node-exchange-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptReservedNodeExchangeAsync accept-reserved-node-exchange-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AcceptReservedNodeExchangeRequest accept-reserved-node-exchange-request]
    (-> this (.acceptReservedNodeExchangeAsync accept-reserved-node-exchange-request))))

(defn disable-logging-async
  "Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.

  disable-logging-request - `com.amazonaws.services.redshift.model.DisableLoggingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DisableLoggingResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DisableLoggingRequest disable-logging-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableLoggingAsync disable-logging-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DisableLoggingRequest disable-logging-request]
    (-> this (.disableLoggingAsync disable-logging-request))))

(defn delete-cluster-subnet-group-async
  "Deletes the specified cluster subnet group.

  delete-cluster-subnet-group-request - `com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClusterSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest delete-cluster-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterSubnetGroupAsync delete-cluster-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteClusterSubnetGroupRequest delete-cluster-subnet-group-request]
    (-> this (.deleteClusterSubnetGroupAsync delete-cluster-subnet-group-request))))

(defn describe-event-subscriptions-async
  "Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you
   specify a subscription name, lists the description for that subscription.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification
   subscriptions that match any combination of the specified keys and values. For example, if you have
   owner and environment for tag keys, and admin and test for
   tag values, all subscriptions that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they
   have tag keys or values associated with them.

  describe-event-subscriptions-request - `com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeEventSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest describe-event-subscriptions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSubscriptionsAsync describe-event-subscriptions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventSubscriptionsRequest describe-event-subscriptions-request]
    (-> this (.describeEventSubscriptionsAsync describe-event-subscriptions-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeEventSubscriptionsAsync))))

(defn copy-cluster-snapshot-async
  "Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated
   snapshot and it must be in the available state.


   When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the
   retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an
   automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained
   until you delete them.


   For more information about working with snapshots, go to Amazon Redshift Snapshots
   in the Amazon Redshift Cluster Management Guide.

  copy-cluster-snapshot-request - `com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest copy-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyClusterSnapshotAsync copy-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CopyClusterSnapshotRequest copy-cluster-snapshot-request]
    (-> this (.copyClusterSnapshotAsync copy-cluster-snapshot-request))))

(defn describe-cluster-subnet-groups-async
  "Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By
   default, this operation returns information about all cluster subnet groups that are defined in you AWS account.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that
   match any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all subnet
   groups that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they
   have tag keys or values associated with them.

  describe-cluster-subnet-groups-request - `com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest describe-cluster-subnet-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterSubnetGroupsAsync describe-cluster-subnet-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSubnetGroupsRequest describe-cluster-subnet-groups-request]
    (-> this (.describeClusterSubnetGroupsAsync describe-cluster-subnet-groups-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeClusterSubnetGroupsAsync))))

(defn modify-snapshot-copy-retention-period-async
  "Modifies the number of days to retain snapshots in the destination AWS Region after they are copied from the
   source AWS Region. By default, this operation only changes the retention period of copied automated snapshots.
   The retention periods for both new and existing copied automated snapshots are updated with the new retention
   period. You can set the manual option to change only the retention periods of copied manual snapshots. If you set
   this option, only newly copied manual snapshots have the new retention period.

  modify-snapshot-copy-retention-period-request - `com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifySnapshotCopyRetentionPeriod operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest modify-snapshot-copy-retention-period-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifySnapshotCopyRetentionPeriodAsync modify-snapshot-copy-retention-period-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifySnapshotCopyRetentionPeriodRequest modify-snapshot-copy-retention-period-request]
    (-> this (.modifySnapshotCopyRetentionPeriodAsync modify-snapshot-copy-retention-period-request))))

(defn describe-snapshot-copy-grants-async
  "Returns a list of snapshot copy grants owned by the AWS account in the destination region.


   For more information about managing snapshot copy grants, go to Amazon Redshift Database
   Encryption in the Amazon Redshift Cluster Management Guide.

  describe-snapshot-copy-grants-request - The result of the DescribeSnapshotCopyGrants action. - `com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshotCopyGrants operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest describe-snapshot-copy-grants-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotCopyGrantsAsync describe-snapshot-copy-grants-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeSnapshotCopyGrantsRequest describe-snapshot-copy-grants-request]
    (-> this (.describeSnapshotCopyGrantsAsync describe-snapshot-copy-grants-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeSnapshotCopyGrantsAsync))))

(defn delete-snapshot-copy-grant-async
  "Deletes the specified snapshot copy grant.

  delete-snapshot-copy-grant-request - The result of the DeleteSnapshotCopyGrant action. - `com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshotCopyGrant operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest delete-snapshot-copy-grant-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotCopyGrantAsync delete-snapshot-copy-grant-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteSnapshotCopyGrantRequest delete-snapshot-copy-grant-request]
    (-> this (.deleteSnapshotCopyGrantAsync delete-snapshot-copy-grant-request))))

(defn rotate-encryption-key-async
  "Rotates the encryption keys for a cluster.

  rotate-encryption-key-request - `com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RotateEncryptionKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest rotate-encryption-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rotateEncryptionKeyAsync rotate-encryption-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RotateEncryptionKeyRequest rotate-encryption-key-request]
    (-> this (.rotateEncryptionKeyAsync rotate-encryption-key-request))))

(defn batch-delete-cluster-snapshots-async
  "Deletes a set of cluster snapshots.

  batch-delete-cluster-snapshots-request - `com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsRequest batch-delete-cluster-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteClusterSnapshotsAsync batch-delete-cluster-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.BatchDeleteClusterSnapshotsRequest batch-delete-cluster-snapshots-request]
    (-> this (.batchDeleteClusterSnapshotsAsync batch-delete-cluster-snapshots-request))))

(defn describe-events-async
  "Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events
   specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the
   name as a parameter. By default, the past hour of events are returned.

  describe-events-request - `com.amazonaws.services.redshift.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventsRequest describe-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync describe-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEventsAsync describe-events-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeEventsAsync))))

(defn describe-cluster-versions-async
  "Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before
   creating any clusters to learn more about the Amazon Redshift versions. For more information about managing
   clusters, go to Amazon
   Redshift Clusters in the Amazon Redshift Cluster Management Guide.

  describe-cluster-versions-request - `com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest describe-cluster-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterVersionsAsync describe-cluster-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterVersionsRequest describe-cluster-versions-request]
    (-> this (.describeClusterVersionsAsync describe-cluster-versions-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeClusterVersionsAsync))))

(defn describe-tags-async
  "Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all
   tags for a given type of resource, such as clusters, snapshots, and so on.


   The following are limitations for DescribeTags:




   You cannot specify an ARN and a resource-type value together in the same request.




   You cannot use the MaxRecords and Marker parameters together with the ARN parameter.




   The MaxRecords parameter can be a range from 10 to 50 results to return in a request.




   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match
   any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all resources
   that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, resources are returned regardless of whether they have
   tag keys or values associated with them.

  describe-tags-request - `com.amazonaws.services.redshift.model.DescribeTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeTagsRequest describe-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync describe-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTagsAsync describe-tags-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeTagsAsync))))

(defn create-cluster-subnet-group-async
  "Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing
   Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.


   For information about subnet groups, go to Amazon Redshift
   Cluster Subnet Groups in the Amazon Redshift Cluster Management Guide.

  create-cluster-subnet-group-request - `com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClusterSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest create-cluster-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterSubnetGroupAsync create-cluster-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterSubnetGroupRequest create-cluster-subnet-group-request]
    (-> this (.createClusterSubnetGroupAsync create-cluster-subnet-group-request))))

(defn describe-cluster-parameter-groups-async
  "Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default
   parameter group. For each parameter group, the response includes the parameter group name, description, and
   parameter group family name. You can optionally specify a name to retrieve the description of a specific
   parameter group.


   For more information about parameters and parameter groups, go to Amazon Redshift
   Parameter Groups in the Amazon Redshift Cluster Management Guide.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups
   that match any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all parameter
   groups that have any combination of those values are returned.


   If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether
   they have tag keys or values associated with them.

  describe-cluster-parameter-groups-request - `com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterParameterGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest describe-cluster-parameter-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterParameterGroupsAsync describe-cluster-parameter-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterParameterGroupsRequest describe-cluster-parameter-groups-request]
    (-> this (.describeClusterParameterGroupsAsync describe-cluster-parameter-groups-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeClusterParameterGroupsAsync))))

(defn reboot-cluster-async
  "Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster,
   during which the cluster status is set to rebooting. A cluster event is created when the reboot is
   completed. Any pending cluster modifications (see ModifyCluster) are applied at this reboot. For more
   information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.

  reboot-cluster-request - `com.amazonaws.services.redshift.model.RebootClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RebootClusterRequest reboot-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootClusterAsync reboot-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.RebootClusterRequest reboot-cluster-request]
    (-> this (.rebootClusterAsync reboot-cluster-request))))

(defn modify-cluster-maintenance-async
  "Modifies the maintenance settings of a cluster. For example, you can defer a maintenance window. You can also
   update or cancel a deferment.

  modify-cluster-maintenance-request - `com.amazonaws.services.redshift.model.ModifyClusterMaintenanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterMaintenance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Cluster>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterMaintenanceRequest modify-cluster-maintenance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterMaintenanceAsync modify-cluster-maintenance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterMaintenanceRequest modify-cluster-maintenance-request]
    (-> this (.modifyClusterMaintenanceAsync modify-cluster-maintenance-request))))

(defn describe-cluster-snapshots-async
  "Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this
   operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No
   information is returned for snapshots owned by inactive AWS customer accounts.


   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match
   any combination of the specified keys and values. For example, if you have owner and
   environment for tag keys, and admin and test for tag values, all snapshots
   that have any combination of those values are returned. Only snapshots that you own are returned in the response;
   shared snapshots are not returned with the tag key and tag value request parameters.


   If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have
   tag keys or values associated with them.

  describe-cluster-snapshots-request - `com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest describe-cluster-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterSnapshotsAsync describe-cluster-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeClusterSnapshotsRequest describe-cluster-snapshots-request]
    (-> this (.describeClusterSnapshotsAsync describe-cluster-snapshots-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeClusterSnapshotsAsync))))

(defn authorize-cluster-security-group-ingress-async
  "Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application
   accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to
   either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group.
   You can add as many as 20 ingress rules to an Amazon Redshift security group.


   If you authorize access to an Amazon EC2 security group, specify EC2SecurityGroupName and
   EC2SecurityGroupOwnerId. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS
   Region.


   If you authorize access to a CIDR/IP address range, specify CIDRIP. For an overview of CIDR blocks, see
   the Wikipedia article on Classless
   Inter-Domain Routing.


   You must also associate the security group with a cluster so that clients running on these IP addresses or the
   EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to Working with Security
   Groups in the Amazon Redshift Cluster Management Guide.

  authorize-cluster-security-group-ingress-request - `com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeClusterSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterSecurityGroup>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest authorize-cluster-security-group-ingress-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeClusterSecurityGroupIngressAsync authorize-cluster-security-group-ingress-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.AuthorizeClusterSecurityGroupIngressRequest authorize-cluster-security-group-ingress-request]
    (-> this (.authorizeClusterSecurityGroupIngressAsync authorize-cluster-security-group-ingress-request))))

(defn modify-cluster-snapshot-async
  "Modifies the settings for a snapshot.

  modify-cluster-snapshot-request - `com.amazonaws.services.redshift.model.ModifyClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.Snapshot>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotRequest modify-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterSnapshotAsync modify-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterSnapshotRequest modify-cluster-snapshot-request]
    (-> this (.modifyClusterSnapshotAsync modify-cluster-snapshot-request))))

(defn create-cluster-parameter-group-async
  "Creates an Amazon Redshift parameter group.


   Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group
   when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster
   is created by using ModifyCluster.


   Parameters in the parameter group define specific behavior that applies to the databases you create on the
   cluster. For more information about parameters and parameter groups, go to Amazon Redshift
   Parameter Groups in the Amazon Redshift Cluster Management Guide.

  create-cluster-parameter-group-request - `com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest create-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterParameterGroupAsync create-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.CreateClusterParameterGroupRequest create-cluster-parameter-group-request]
    (-> this (.createClusterParameterGroupAsync create-cluster-parameter-group-request))))

(defn delete-snapshot-schedule-async
  "Deletes a snapshot schedule.

  delete-snapshot-schedule-request - `com.amazonaws.services.redshift.model.DeleteSnapshotScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DeleteSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteSnapshotScheduleRequest delete-snapshot-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotScheduleAsync delete-snapshot-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DeleteSnapshotScheduleRequest delete-snapshot-schedule-request]
    (-> this (.deleteSnapshotScheduleAsync delete-snapshot-schedule-request))))

(defn modify-cluster-parameter-group-async
  "Modifies the parameters of a parameter group.


   For more information about parameters and parameter groups, go to Amazon Redshift
   Parameter Groups in the Amazon Redshift Cluster Management Guide.

  modify-cluster-parameter-group-request - `com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ModifyClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest modify-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClusterParameterGroupAsync modify-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyClusterParameterGroupRequest modify-cluster-parameter-group-request]
    (-> this (.modifyClusterParameterGroupAsync modify-cluster-parameter-group-request))))

(defn describe-orderable-cluster-options-async
  "Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find
   what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS Region that you can
   specify, and the node types you can request. The node types differ by available storage, memory, CPU and price.
   With the cost involved you might want to obtain a list of cluster options in the specific region and specify
   values when creating a cluster. For more information about managing clusters, go to Amazon Redshift Clusters
   in the Amazon Redshift Cluster Management Guide.

  describe-orderable-cluster-options-request - `com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrderableClusterOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest describe-orderable-cluster-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrderableClusterOptionsAsync describe-orderable-cluster-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeOrderableClusterOptionsRequest describe-orderable-cluster-options-request]
    (-> this (.describeOrderableClusterOptionsAsync describe-orderable-cluster-options-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeOrderableClusterOptionsAsync))))

(defn describe-reserved-node-offerings-async
  "Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the
   node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you.
   These descriptions help you determine which reserve node offering you want to purchase. You then use the unique
   offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon
   Redshift cluster.


   For more information about reserved node offerings, go to Purchasing Reserved
   Nodes in the Amazon Redshift Cluster Management Guide.

  describe-reserved-node-offerings-request - `com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedNodeOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest describe-reserved-node-offerings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedNodeOfferingsAsync describe-reserved-node-offerings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeReservedNodeOfferingsRequest describe-reserved-node-offerings-request]
    (-> this (.describeReservedNodeOfferingsAsync describe-reserved-node-offerings-request)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this]
    (-> this (.describeReservedNodeOfferingsAsync))))

(defn modify-event-subscription-async
  "Modifies an existing Amazon Redshift event notification subscription.

  modify-event-subscription-request - `com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest modify-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEventSubscriptionAsync modify-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifyEventSubscriptionRequest modify-event-subscription-request]
    (-> this (.modifyEventSubscriptionAsync modify-event-subscription-request))))

(defn describe-account-attributes-async
  "Returns a list of attributes attached to an account

  describe-account-attributes-request - `com.amazonaws.services.redshift.model.DescribeAccountAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeAccountAttributesRequest describe-account-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.DescribeAccountAttributesRequest describe-account-attributes-request]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request))))

(defn modify-snapshot-schedule-async
  "Modifies a snapshot schedule. Any schedule associated with a cluster is modified asynchronously.

  modify-snapshot-schedule-request - `com.amazonaws.services.redshift.model.ModifySnapshotScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifySnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.redshift.model.ModifySnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifySnapshotScheduleRequest modify-snapshot-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifySnapshotScheduleAsync modify-snapshot-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRedshiftAsync this ^com.amazonaws.services.redshift.model.ModifySnapshotScheduleRequest modify-snapshot-schedule-request]
    (-> this (.modifySnapshotScheduleAsync modify-snapshot-schedule-request))))

