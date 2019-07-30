(ns com.amazonaws.services.snowball.AmazonSnowballClient
  "Client for accessing Amazon Snowball. All service calls made using this client are blocking, and will not return
  until the service call completes.


  AWS Snowball is a petabyte-scale data transport solution that uses secure devices to transfer large amounts of data
  between your on-premises data centers and Amazon Simple Storage Service (Amazon S3). The commands described here
  provide access to the same functionality that is available in the AWS Snowball Management Console, which enables you
  to create and manage jobs for Snowball and Snowball Edge devices. To transfer data locally with a device, you'll need
  to use the Snowball client or the Amazon S3 API adapter for Snowball."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.snowball AmazonSnowballClient]))

(defn ->amazon-snowball-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Snowball (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonSnowballClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonSnowballClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonSnowballClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonSnowballClient aws-credentials client-configuration))
  (^AmazonSnowballClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonSnowballClient client-configuration))
  (^AmazonSnowballClient []
    (new AmazonSnowballClient )))

(defn *builder
  "returns: `com.amazonaws.services.snowball.AmazonSnowballClientBuilder`"
  (^com.amazonaws.services.snowball.AmazonSnowballClientBuilder []
    (AmazonSnowballClient/builder )))

(defn cancel-cluster
  "Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status.
   You'll have at least an hour after creating a cluster job to cancel it.

  request - `com.amazonaws.services.snowball.model.CancelClusterRequest`

  returns: Result of the CancelCluster operation returned by the service. - `com.amazonaws.services.snowball.model.CancelClusterResult`

  throws: com.amazonaws.services.snowball.model.KMSRequestFailedException - The provided AWS Key Management Service key lacks the permissions to perform the specified CreateJob or UpdateJob action."
  (^com.amazonaws.services.snowball.model.CancelClusterResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.CancelClusterRequest request]
    (-> this (.cancelCluster request))))

(defn describe-cluster
  "Returns information about a specific cluster including shipping information, cluster status, and other important
   metadata.

  request - `com.amazonaws.services.snowball.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeClusterResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.DescribeClusterResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.DescribeClusterRequest request]
    (-> this (.describeCluster request))))

(defn list-cluster-jobs
  "Returns an array of JobListEntry objects of the specified length. Each JobListEntry
   object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.

  request - `com.amazonaws.services.snowball.model.ListClusterJobsRequest`

  returns: Result of the ListClusterJobs operation returned by the service. - `com.amazonaws.services.snowball.model.ListClusterJobsResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.ListClusterJobsResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.ListClusterJobsRequest request]
    (-> this (.listClusterJobs request))))

(defn describe-job
  "Returns information about a specific job including shipping information, job status, and other important
   metadata.

  request - `com.amazonaws.services.snowball.model.DescribeJobRequest`

  returns: Result of the DescribeJob operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeJobResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.DescribeJobResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.DescribeJobRequest request]
    (-> this (.describeJob request))))

(defn describe-addresses
  "Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return
   addresses from the list of all addresses associated with this account in all US regions.

  request - `com.amazonaws.services.snowball.model.DescribeAddressesRequest`

  returns: Result of the DescribeAddresses operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeAddressesResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.DescribeAddressesResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.DescribeAddressesRequest request]
    (-> this (.describeAddresses request))))

(defn update-job
  "While a job's JobState value is New, you can update some of the information associated
   with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created,
   this action is no longer available.

  request - `com.amazonaws.services.snowball.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.snowball.model.UpdateJobResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.UpdateJobResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.UpdateJobRequest request]
    (-> this (.updateJob request))))

(defn list-compatible-images
  "This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS
   account that would be supported for use on EDGE, EDGE_C, and EDGE_CG
   devices. For more information on compatible AMIs, see Using Amazon EC2 Compute
   Instances in the AWS Snowball Developer Guide.

  request - `com.amazonaws.services.snowball.model.ListCompatibleImagesRequest`

  returns: Result of the ListCompatibleImages operation returned by the service. - `com.amazonaws.services.snowball.model.ListCompatibleImagesResult`

  throws: com.amazonaws.services.snowball.model.InvalidNextTokenException - The NextToken string was altered unexpectedly, and the operation has stopped. Run the operation without changing the NextToken string, and try again."
  (^com.amazonaws.services.snowball.model.ListCompatibleImagesResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.ListCompatibleImagesRequest request]
    (-> this (.listCompatibleImages request))))

(defn get-job-unlock-code
  "Returns the UnlockCode code value for the specified job. A particular UnlockCode value
   can be accessed for up to 90 days after the associated job has been created.


   The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code
   is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the
   Snowball client when the client is started for the first time.


   As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location
   as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access
   to the Snowball associated with that job.

  request - `com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest`

  returns: Result of the GetJobUnlockCode operation returned by the service. - `com.amazonaws.services.snowball.model.GetJobUnlockCodeResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.GetJobUnlockCodeResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest request]
    (-> this (.getJobUnlockCode request))))

(defn cancel-job
  "Cancels the specified job. You can only cancel a job before its JobState value changes to
   PreparingAppliance. Requesting the ListJobs or DescribeJob action returns
   a job's JobState as part of the response element data returned.

  request - `com.amazonaws.services.snowball.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.snowball.model.CancelJobResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.CancelJobResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn list-jobs
  "Returns an array of JobListEntry objects of the specified length. Each JobListEntry
   object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case
   of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs
   associated with this account in all US regions.

  request - `com.amazonaws.services.snowball.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.snowball.model.ListJobsResult`

  throws: com.amazonaws.services.snowball.model.InvalidNextTokenException - The NextToken string was altered unexpectedly, and the operation has stopped. Run the operation without changing the NextToken string, and try again."
  (^com.amazonaws.services.snowball.model.ListJobsResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn create-address
  "Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of
   creation. The address you provide must be located within the serviceable area of your region. If the address is
   invalid or unsupported, then an exception is thrown.

  request - `com.amazonaws.services.snowball.model.CreateAddressRequest`

  returns: Result of the CreateAddress operation returned by the service. - `com.amazonaws.services.snowball.model.CreateAddressResult`

  throws: com.amazonaws.services.snowball.model.InvalidAddressException - The address provided was invalid. Check the address with your region's carrier, and try again."
  (^com.amazonaws.services.snowball.model.CreateAddressResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.CreateAddressRequest request]
    (-> this (.createAddress request))))

(defn get-snowball-usage
  "Returns information about the Snowball service limit for your account, and also the number of Snowballs your
   account has in use.


   The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase
   your service limit, contact AWS Support.

  request - `com.amazonaws.services.snowball.model.GetSnowballUsageRequest`

  returns: Result of the GetSnowballUsage operation returned by the service. - `com.amazonaws.services.snowball.model.GetSnowballUsageResult`"
  (^com.amazonaws.services.snowball.model.GetSnowballUsageResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.GetSnowballUsageRequest request]
    (-> this (.getSnowballUsage request))))

(defn create-cluster
  "Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to
   create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.

  request - `com.amazonaws.services.snowball.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.snowball.model.CreateClusterResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.CreateClusterResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn update-cluster
  "While a cluster's ClusterState value is in the AwaitingQuorum state, you can update
   some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60
   minutes after the cluster being created, this action is no longer available.

  request - `com.amazonaws.services.snowball.model.UpdateClusterRequest`

  returns: Result of the UpdateCluster operation returned by the service. - `com.amazonaws.services.snowball.model.UpdateClusterResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.UpdateClusterResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.UpdateClusterRequest request]
    (-> this (.updateCluster request))))

(defn describe-address
  "Takes an AddressId and returns specific details about that address in the form of an
   Address object.

  request - `com.amazonaws.services.snowball.model.DescribeAddressRequest`

  returns: Result of the DescribeAddress operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeAddressResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.DescribeAddressResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.DescribeAddressRequest request]
    (-> this (.describeAddress request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonSnowballClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-job-manifest
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

  request - `com.amazonaws.services.snowball.model.GetJobManifestRequest`

  returns: Result of the GetJobManifest operation returned by the service. - `com.amazonaws.services.snowball.model.GetJobManifestResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.GetJobManifestResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.GetJobManifestRequest request]
    (-> this (.getJobManifest request))))

(defn create-job
  "Creates a job to the other job attributes are inherited from the cluster.

  request - `com.amazonaws.services.snowball.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.snowball.model.CreateJobResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.CreateJobResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn list-clusters
  "Returns an array of ClusterListEntry objects of the specified length. Each
   ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status
   information.

  request - `com.amazonaws.services.snowball.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.snowball.model.ListClustersResult`

  throws: com.amazonaws.services.snowball.model.InvalidNextTokenException - The NextToken string was altered unexpectedly, and the operation has stopped. Run the operation without changing the NextToken string, and try again."
  (^com.amazonaws.services.snowball.model.ListClustersResult [^AmazonSnowballClient this ^com.amazonaws.services.snowball.model.ListClustersRequest request]
    (-> this (.listClusters request))))

