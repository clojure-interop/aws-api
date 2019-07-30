(ns com.amazonaws.services.snowball.AmazonSnowballAsync
  "Interface for accessing Amazon Snowball asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSnowballAsync instead.



  AWS Snowball is a petabyte-scale data transport solution that uses secure devices to transfer large amounts of data
  between your on-premises data centers and Amazon Simple Storage Service (Amazon S3). The commands described here
  provide access to the same functionality that is available in the AWS Snowball Management Console, which enables you
  to create and manage jobs for Snowball and Snowball Edge devices. To transfer data locally with a device, you'll need
  to use the Snowball client or the Amazon S3 API adapter for Snowball."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.snowball AmazonSnowballAsync]))

(defn describe-job-async
  "Returns information about a specific job including shipping information, job status, and other important
   metadata.

  describe-job-request - `com.amazonaws.services.snowball.model.DescribeJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.DescribeJobResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeJobRequest describe-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobAsync describe-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeJobRequest describe-job-request]
    (-> this (.describeJobAsync describe-job-request))))

(defn create-cluster-async
  "Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to
   create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.

  create-cluster-request - `com.amazonaws.services.snowball.model.CreateClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateClusterRequest create-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync create-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateClusterRequest create-cluster-request]
    (-> this (.createClusterAsync create-cluster-request))))

(defn list-compatible-images-async
  "This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS
   account that would be supported for use on EDGE, EDGE_C, and EDGE_CG
   devices. For more information on compatible AMIs, see Using Amazon EC2 Compute
   Instances in the AWS Snowball Developer Guide.

  list-compatible-images-request - `com.amazonaws.services.snowball.model.ListCompatibleImagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCompatibleImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.ListCompatibleImagesResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListCompatibleImagesRequest list-compatible-images-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCompatibleImagesAsync list-compatible-images-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListCompatibleImagesRequest list-compatible-images-request]
    (-> this (.listCompatibleImagesAsync list-compatible-images-request))))

(defn list-jobs-async
  "Returns an array of JobListEntry objects of the specified length. Each JobListEntry
   object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case
   of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs
   associated with this account in all US regions.

  list-jobs-request - `com.amazonaws.services.snowball.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListJobsRequest list-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync list-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobsAsync list-jobs-request))))

(defn get-snowball-usage-async
  "Returns information about the Snowball service limit for your account, and also the number of Snowballs your
   account has in use.


   The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase
   your service limit, contact AWS Support.

  get-snowball-usage-request - `com.amazonaws.services.snowball.model.GetSnowballUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSnowballUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.GetSnowballUsageResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetSnowballUsageRequest get-snowball-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSnowballUsageAsync get-snowball-usage-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetSnowballUsageRequest get-snowball-usage-request]
    (-> this (.getSnowballUsageAsync get-snowball-usage-request))))

(defn get-job-unlock-code-async
  "Returns the UnlockCode code value for the specified job. A particular UnlockCode value
   can be accessed for up to 90 days after the associated job has been created.


   The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code
   is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the
   Snowball client when the client is started for the first time.


   As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location
   as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access
   to the Snowball associated with that job.

  get-job-unlock-code-request - `com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobUnlockCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.GetJobUnlockCodeResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest get-job-unlock-code-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobUnlockCodeAsync get-job-unlock-code-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest get-job-unlock-code-request]
    (-> this (.getJobUnlockCodeAsync get-job-unlock-code-request))))

(defn describe-addresses-async
  "Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return
   addresses from the list of all addresses associated with this account in all US regions.

  describe-addresses-request - `com.amazonaws.services.snowball.model.DescribeAddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.DescribeAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeAddressesRequest describe-addresses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAddressesAsync describe-addresses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeAddressesRequest describe-addresses-request]
    (-> this (.describeAddressesAsync describe-addresses-request))))

(defn describe-address-async
  "Takes an AddressId and returns specific details about that address in the form of an
   Address object.

  describe-address-request - `com.amazonaws.services.snowball.model.DescribeAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.DescribeAddressResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeAddressRequest describe-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAddressAsync describe-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeAddressRequest describe-address-request]
    (-> this (.describeAddressAsync describe-address-request))))

(defn cancel-job-async
  "Cancels the specified job. You can only cancel a job before its JobState value changes to
   PreparingAppliance. Requesting the ListJobs or DescribeJob action returns
   a job's JobState as part of the response element data returned.

  cancel-job-request - `com.amazonaws.services.snowball.model.CancelJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CancelJobRequest cancel-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync cancel-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJobAsync cancel-job-request))))

(defn create-job-async
  "Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must
   have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for
   a node in a cluster, you only need to provide the clusterId value; the other job attributes are
   inherited from the cluster.

  create-job-request - `com.amazonaws.services.snowball.model.CreateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateJobRequest create-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync create-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateJobRequest create-job-request]
    (-> this (.createJobAsync create-job-request))))

(defn list-clusters-async
  "Returns an array of ClusterListEntry objects of the specified length. Each
   ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status
   information.

  list-clusters-request - `com.amazonaws.services.snowball.model.ListClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.ListClustersResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListClustersRequest list-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClustersAsync list-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListClustersRequest list-clusters-request]
    (-> this (.listClustersAsync list-clusters-request))))

(defn get-job-manifest-async
  "Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified
   JobId value. You can access the manifest file for up to 60 minutes after this request has been made.
   To access the manifest file after 60 minutes have passed, you'll have to make another call to the
   GetJobManifest action.


   The manifest is an encrypted file that you can download after your job enters the WithCustomer
   status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to
   the Snowball through the Snowball client when the client is started for the first time.


   As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same
   location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from
   gaining access to the Snowball associated with that job.


   The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is
   created.

  get-job-manifest-request - `com.amazonaws.services.snowball.model.GetJobManifestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobManifest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.GetJobManifestResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetJobManifestRequest get-job-manifest-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobManifestAsync get-job-manifest-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetJobManifestRequest get-job-manifest-request]
    (-> this (.getJobManifestAsync get-job-manifest-request))))

(defn update-job-async
  "While a job's JobState value is New, you can update some of the information associated
   with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created,
   this action is no longer available.

  update-job-request - `com.amazonaws.services.snowball.model.UpdateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.UpdateJobResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.UpdateJobRequest update-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobAsync update-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.UpdateJobRequest update-job-request]
    (-> this (.updateJobAsync update-job-request))))

(defn list-cluster-jobs-async
  "Returns an array of JobListEntry objects of the specified length. Each JobListEntry
   object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.

  list-cluster-jobs-request - `com.amazonaws.services.snowball.model.ListClusterJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusterJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.ListClusterJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListClusterJobsRequest list-cluster-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClusterJobsAsync list-cluster-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListClusterJobsRequest list-cluster-jobs-request]
    (-> this (.listClusterJobsAsync list-cluster-jobs-request))))

(defn cancel-cluster-async
  "Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status.
   You'll have at least an hour after creating a cluster job to cancel it.

  cancel-cluster-request - `com.amazonaws.services.snowball.model.CancelClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.CancelClusterResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CancelClusterRequest cancel-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelClusterAsync cancel-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CancelClusterRequest cancel-cluster-request]
    (-> this (.cancelClusterAsync cancel-cluster-request))))

(defn describe-cluster-async
  "Returns information about a specific cluster including shipping information, cluster status, and other important
   metadata.

  describe-cluster-request - `com.amazonaws.services.snowball.model.DescribeClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.DescribeClusterResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeClusterRequest describe-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterAsync describe-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeClusterRequest describe-cluster-request]
    (-> this (.describeClusterAsync describe-cluster-request))))

(defn update-cluster-async
  "While a cluster's ClusterState value is in the AwaitingQuorum state, you can update
   some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60
   minutes after the cluster being created, this action is no longer available.

  update-cluster-request - `com.amazonaws.services.snowball.model.UpdateClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.UpdateClusterResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.UpdateClusterRequest update-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterAsync update-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.UpdateClusterRequest update-cluster-request]
    (-> this (.updateClusterAsync update-cluster-request))))

(defn create-address-async
  "Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of
   creation. The address you provide must be located within the serviceable area of your region. If the address is
   invalid or unsupported, then an exception is thrown.

  create-address-request - `com.amazonaws.services.snowball.model.CreateAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.CreateAddressResult>`"
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateAddressRequest create-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAddressAsync create-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateAddressRequest create-address-request]
    (-> this (.createAddressAsync create-address-request))))

