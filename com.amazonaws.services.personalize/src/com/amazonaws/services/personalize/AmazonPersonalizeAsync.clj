(ns com.amazonaws.services.personalize.AmazonPersonalizeAsync
  "Interface for accessing Amazon Personalize asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPersonalizeAsync instead.



  Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to
  customers."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalize AmazonPersonalizeAsync]))

(defn delete-dataset-async
  "Deletes a dataset. You can't delete a dataset if an associated DatasetImportJob or
   SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on datasets, see
   CreateDataset.

  delete-dataset-request - `com.amazonaws.services.personalize.model.DeleteDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteDatasetRequest delete-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatasetAsync delete-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteDatasetRequest delete-dataset-request]
    (-> this (.deleteDatasetAsync delete-dataset-request))))

(defn describe-dataset-group-async
  "Describes the given dataset group. For more information on dataset groups, see CreateDatasetGroup.

  describe-dataset-group-request - `com.amazonaws.services.personalize.model.DescribeDatasetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDatasetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeDatasetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetGroupRequest describe-dataset-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatasetGroupAsync describe-dataset-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetGroupRequest describe-dataset-group-request]
    (-> this (.describeDatasetGroupAsync describe-dataset-group-request))))

(defn list-solutions-async
  "Returns a list of solutions that use the given dataset group. When a dataset group is not specified, all the
   solutions associated with the account are listed. The response provides the properties for each solution,
   including the Amazon Resource Name (ARN). For more information on solutions, see CreateSolution.

  list-solutions-request - `com.amazonaws.services.personalize.model.ListSolutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSolutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListSolutionsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSolutionsRequest list-solutions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSolutionsAsync list-solutions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSolutionsRequest list-solutions-request]
    (-> this (.listSolutionsAsync list-solutions-request))))

(defn delete-campaign-async
  "Removes a campaign by deleting the solution deployment. The solution that the campaign is based on is not deleted
   and can be redeployed when needed. A deleted campaign can no longer be specified in a GetRecommendations
   request. For more information on campaigns, see CreateCampaign.

  delete-campaign-request - `com.amazonaws.services.personalize.model.DeleteCampaignRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteCampaignRequest delete-campaign-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCampaignAsync delete-campaign-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteCampaignRequest delete-campaign-request]
    (-> this (.deleteCampaignAsync delete-campaign-request))))

(defn describe-feature-transformation-async
  "Describes the given feature transformation.

  describe-feature-transformation-request - `com.amazonaws.services.personalize.model.DescribeFeatureTransformationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFeatureTransformation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeFeatureTransformationResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeFeatureTransformationRequest describe-feature-transformation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFeatureTransformationAsync describe-feature-transformation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeFeatureTransformationRequest describe-feature-transformation-request]
    (-> this (.describeFeatureTransformationAsync describe-feature-transformation-request))))

(defn describe-solution-async
  "Describes a solution. For more information on solutions, see CreateSolution.

  describe-solution-request - `com.amazonaws.services.personalize.model.DescribeSolutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSolution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeSolutionResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSolutionRequest describe-solution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSolutionAsync describe-solution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSolutionRequest describe-solution-request]
    (-> this (.describeSolutionAsync describe-solution-request))))

(defn delete-dataset-group-async
  "Deletes a dataset group. Before you delete a dataset group, you must delete the following:




   All associated event trackers.




   All associated solutions.




   All datasets in the dataset group.

  delete-dataset-group-request - `com.amazonaws.services.personalize.model.DeleteDatasetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDatasetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteDatasetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteDatasetGroupRequest delete-dataset-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatasetGroupAsync delete-dataset-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteDatasetGroupRequest delete-dataset-group-request]
    (-> this (.deleteDatasetGroupAsync delete-dataset-group-request))))

(defn describe-campaign-async
  "Describes the given campaign, including its status.


   A campaign can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING > DELETE IN_PROGRESS




   When the status is CREATE FAILED, the response includes the failureReason
   key, which describes why.


   For more information on campaigns, see CreateCampaign.

  describe-campaign-request - `com.amazonaws.services.personalize.model.DescribeCampaignRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeCampaignRequest describe-campaign-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCampaignAsync describe-campaign-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeCampaignRequest describe-campaign-request]
    (-> this (.describeCampaignAsync describe-campaign-request))))

(defn list-campaigns-async
  "Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns
   associated with the account are listed. The response provides the properties for each campaign, including the
   Amazon Resource Name (ARN). For more information on campaigns, see CreateCampaign.

  list-campaigns-request - `com.amazonaws.services.personalize.model.ListCampaignsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCampaigns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListCampaignsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListCampaignsRequest list-campaigns-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCampaignsAsync list-campaigns-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListCampaignsRequest list-campaigns-request]
    (-> this (.listCampaignsAsync list-campaigns-request))))

(defn list-event-trackers-async
  "Returns the list of event trackers associated with the account. The response provides the properties for each
   event tracker, including the Amazon Resource Name (ARN) and tracking ID. For more information on event trackers,
   see CreateEventTracker.

  list-event-trackers-request - `com.amazonaws.services.personalize.model.ListEventTrackersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventTrackers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListEventTrackersResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListEventTrackersRequest list-event-trackers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventTrackersAsync list-event-trackers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListEventTrackersRequest list-event-trackers-request]
    (-> this (.listEventTrackersAsync list-event-trackers-request))))

(defn list-solution-versions-async
  "Returns a list of solution versions for the given solution. When a solution is not specified, all the solution
   versions associated with the account are listed. The response provides the properties for each solution version,
   including the Amazon Resource Name (ARN). For more information on solutions, see CreateSolution.

  list-solution-versions-request - `com.amazonaws.services.personalize.model.ListSolutionVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSolutionVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListSolutionVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSolutionVersionsRequest list-solution-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSolutionVersionsAsync list-solution-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSolutionVersionsRequest list-solution-versions-request]
    (-> this (.listSolutionVersionsAsync list-solution-versions-request))))

(defn describe-dataset-import-job-async
  "Describes the dataset import job created by CreateDatasetImportJob, including the import job status.

  describe-dataset-import-job-request - `com.amazonaws.services.personalize.model.DescribeDatasetImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDatasetImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeDatasetImportJobResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetImportJobRequest describe-dataset-import-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatasetImportJobAsync describe-dataset-import-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetImportJobRequest describe-dataset-import-job-request]
    (-> this (.describeDatasetImportJobAsync describe-dataset-import-job-request))))

(defn get-solution-metrics-async
  "Gets the metrics for the specified solution version.

  get-solution-metrics-request - `com.amazonaws.services.personalize.model.GetSolutionMetricsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSolutionMetrics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.GetSolutionMetricsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.GetSolutionMetricsRequest get-solution-metrics-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSolutionMetricsAsync get-solution-metrics-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.GetSolutionMetricsRequest get-solution-metrics-request]
    (-> this (.getSolutionMetricsAsync get-solution-metrics-request))))

(defn create-event-tracker-async
  "Creates an event tracker that you use when sending event data to the specified dataset group using the PutEvents API.


   When Amazon Personalize creates an event tracker, it also creates an event-interactions dataset in the
   dataset group associated with the event tracker. The event-interactions dataset stores the event data from the
   PutEvents call. The contents of this dataset are not available to the user.



   Only one event tracker can be associated with a dataset group. You will get an error if you call
   CreateEventTracker using the same dataset group as an existing event tracker.



   When you send event data you include your tracking ID. The tracking ID identifies the customer and authorizes the
   customer to send the data.


   The event tracker can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING > DELETE IN_PROGRESS




   To get the status of the event tracker, call DescribeEventTracker.



   The event tracker must be in the ACTIVE state before using the tracking ID.



   Related APIs




   ListEventTrackers




   DescribeEventTracker




   DeleteEventTracker

  create-event-tracker-request - `com.amazonaws.services.personalize.model.CreateEventTrackerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventTracker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateEventTrackerResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateEventTrackerRequest create-event-tracker-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventTrackerAsync create-event-tracker-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateEventTrackerRequest create-event-tracker-request]
    (-> this (.createEventTrackerAsync create-event-tracker-request))))

(defn list-datasets-async
  "Returns the list of datasets contained in the given dataset group. The response provides the properties for each
   dataset, including the Amazon Resource Name (ARN). For more information on datasets, see CreateDataset.

  list-datasets-request - `com.amazonaws.services.personalize.model.ListDatasetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListDatasetsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetsRequest list-datasets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetsAsync list-datasets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetsRequest list-datasets-request]
    (-> this (.listDatasetsAsync list-datasets-request))))

(defn create-dataset-import-job-async
  "Creates a job that imports training data from your data source (an Amazon S3 bucket) to an Amazon Personalize
   dataset. To allow Amazon Personalize to import the training data, you must specify an AWS Identity and Access
   Management (IAM) role that has permission to read from the data source.



   The dataset import job replaces any previous data in the dataset.



   Status


   A dataset import job can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   To get the status of the import job, call DescribeDatasetImportJob, providing the Amazon Resource Name
   (ARN) of the dataset import job. The dataset import is complete when the status shows as ACTIVE. If the status
   shows as CREATE FAILED, the response includes a failureReason key, which describes why the job
   failed.



   Importing takes time. You must wait until the status shows as ACTIVE before training a model using the dataset.



   Related APIs




   ListDatasetImportJobs




   DescribeDatasetImportJob

  create-dataset-import-job-request - `com.amazonaws.services.personalize.model.CreateDatasetImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDatasetImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateDatasetImportJobResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetImportJobRequest create-dataset-import-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatasetImportJobAsync create-dataset-import-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetImportJobRequest create-dataset-import-job-request]
    (-> this (.createDatasetImportJobAsync create-dataset-import-job-request))))

(defn create-campaign-async
  "Creates a campaign by deploying a solution version. When a client calls the GetRecommendations
   and
   GetPersonalizedRanking APIs, a campaign is specified in the request.


   Minimum Provisioned TPS and Auto-Scaling


   A transaction is a single GetRecommendations or GetPersonalizedRanking call.
   Transactions per second (TPS) is the throughput and unit of billing for Amazon Personalize. The minimum
   provisioned TPS (minProvisionedTPS) specifies the baseline throughput provisioned by Amazon
   Personalize, and thus, the minimum billing charge. If your TPS increases beyond minProvisionedTPS,
   Amazon Personalize auto-scales the provisioned capacity up and down, but never below
   minProvisionedTPS, to maintain a 70% utilization. There's a short time delay while the capacity is
   increased that might cause loss of transactions. It's recommended to start with a low
   minProvisionedTPS, track your usage using Amazon CloudWatch metrics, and then increase the
   minProvisionedTPS as necessary.


   Status


   A campaign can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING > DELETE IN_PROGRESS




   To get the campaign status, call DescribeCampaign.



   Wait until the status of the campaign is ACTIVE before asking the campaign for
   recommendations.



   Related APIs




   ListCampaigns




   DescribeCampaign




   UpdateCampaign




   DeleteCampaign

  create-campaign-request - `com.amazonaws.services.personalize.model.CreateCampaignRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateCampaignRequest create-campaign-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCampaignAsync create-campaign-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateCampaignRequest create-campaign-request]
    (-> this (.createCampaignAsync create-campaign-request))))

(defn describe-event-tracker-async
  "Describes an event tracker. The response includes the trackingId and status of the
   event tracker. For more information on event trackers, see CreateEventTracker.

  describe-event-tracker-request - `com.amazonaws.services.personalize.model.DescribeEventTrackerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventTracker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeEventTrackerResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeEventTrackerRequest describe-event-tracker-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventTrackerAsync describe-event-tracker-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeEventTrackerRequest describe-event-tracker-request]
    (-> this (.describeEventTrackerAsync describe-event-tracker-request))))

(defn describe-schema-async
  "Describes a schema. For more information on schemas, see CreateSchema.

  describe-schema-request - `com.amazonaws.services.personalize.model.DescribeSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSchemaRequest describe-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSchemaAsync describe-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSchemaRequest describe-schema-request]
    (-> this (.describeSchemaAsync describe-schema-request))))

(defn create-solution-version-async
  "Trains or retrains an active solution. A solution is created using the CreateSolution operation and must
   be in the ACTIVE state before calling CreateSolutionVersion. A new version of the solution is
   created every time you call this operation.


   Status


   A solution version can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   To get the status of the version, call DescribeSolutionVersion. Wait until the status shows as ACTIVE
   before calling CreateCampaign.


   If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why
   the job failed.


   Related APIs




   ListSolutionVersions




   DescribeSolutionVersion






   ListSolutions




   CreateSolution




   DescribeSolution




   DeleteSolution

  create-solution-version-request - `com.amazonaws.services.personalize.model.CreateSolutionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSolutionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateSolutionVersionResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSolutionVersionRequest create-solution-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSolutionVersionAsync create-solution-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSolutionVersionRequest create-solution-version-request]
    (-> this (.createSolutionVersionAsync create-solution-version-request))))

(defn list-recipes-async
  "Returns a list of available recipes. The response provides the properties for each recipe, including the recipe's
   Amazon Resource Name (ARN).

  list-recipes-request - `com.amazonaws.services.personalize.model.ListRecipesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRecipes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListRecipesResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListRecipesRequest list-recipes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRecipesAsync list-recipes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListRecipesRequest list-recipes-request]
    (-> this (.listRecipesAsync list-recipes-request))))

(defn describe-algorithm-async
  "Describes the given algorithm.

  describe-algorithm-request - `com.amazonaws.services.personalize.model.DescribeAlgorithmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlgorithm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeAlgorithmResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeAlgorithmRequest describe-algorithm-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAlgorithmAsync describe-algorithm-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeAlgorithmRequest describe-algorithm-request]
    (-> this (.describeAlgorithmAsync describe-algorithm-request))))

(defn describe-solution-version-async
  "Describes a specific version of a solution. For more information on solutions, see CreateSolution.

  describe-solution-version-request - `com.amazonaws.services.personalize.model.DescribeSolutionVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSolutionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeSolutionVersionResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSolutionVersionRequest describe-solution-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSolutionVersionAsync describe-solution-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSolutionVersionRequest describe-solution-version-request]
    (-> this (.describeSolutionVersionAsync describe-solution-version-request))))

(defn describe-dataset-async
  "Describes the given dataset. For more information on datasets, see CreateDataset.

  describe-dataset-request - `com.amazonaws.services.personalize.model.DescribeDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetRequest describe-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatasetAsync describe-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetRequest describe-dataset-request]
    (-> this (.describeDatasetAsync describe-dataset-request))))

(defn delete-schema-async
  "Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more
   information on schemas, see CreateSchema.

  delete-schema-request - `com.amazonaws.services.personalize.model.DeleteSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteSchemaRequest delete-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSchemaAsync delete-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteSchemaRequest delete-schema-request]
    (-> this (.deleteSchemaAsync delete-schema-request))))

(defn list-dataset-groups-async
  "Returns a list of dataset groups. The response provides the properties for each dataset group, including the
   Amazon Resource Name (ARN). For more information on dataset groups, see CreateDatasetGroup.

  list-dataset-groups-request - `com.amazonaws.services.personalize.model.ListDatasetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListDatasetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetGroupsRequest list-dataset-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetGroupsAsync list-dataset-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetGroupsRequest list-dataset-groups-request]
    (-> this (.listDatasetGroupsAsync list-dataset-groups-request))))

(defn create-dataset-async
  "Creates an empty dataset and adds it to the specified dataset group. Use CreateDatasetImportJob to import
   your training data to a dataset.


   There are three types of datasets:




   Interactions




   Items




   Users




   Each dataset type has an associated schema with required field types. Only the Interactions dataset
   is required in order to train a model (also referred to as creating a solution).


   A dataset can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING > DELETE IN_PROGRESS




   To get the status of the dataset, call DescribeDataset.


   Related APIs




   CreateDatasetGroup




   ListDatasets




   DescribeDataset




   DeleteDataset

  create-dataset-request - `com.amazonaws.services.personalize.model.CreateDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateDatasetResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetRequest create-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatasetAsync create-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetRequest create-dataset-request]
    (-> this (.createDatasetAsync create-dataset-request))))

(defn delete-solution-async
  "Deletes all versions of a solution and the Solution object itself. Before deleting a solution, you
   must delete all campaigns based on the solution. To determine what campaigns are using the solution, call
   ListCampaigns and supply the Amazon Resource Name (ARN) of the solution. You can't delete a solution if an
   associated SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on
   solutions, see CreateSolution.

  delete-solution-request - `com.amazonaws.services.personalize.model.DeleteSolutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSolution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteSolutionResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteSolutionRequest delete-solution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSolutionAsync delete-solution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteSolutionRequest delete-solution-request]
    (-> this (.deleteSolutionAsync delete-solution-request))))

(defn delete-event-tracker-async
  "Deletes the event tracker. Does not delete the event-interactions dataset from the associated dataset group. For
   more information on event trackers, see CreateEventTracker.

  delete-event-tracker-request - `com.amazonaws.services.personalize.model.DeleteEventTrackerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventTracker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteEventTrackerResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteEventTrackerRequest delete-event-tracker-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventTrackerAsync delete-event-tracker-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteEventTrackerRequest delete-event-tracker-request]
    (-> this (.deleteEventTrackerAsync delete-event-tracker-request))))

(defn create-dataset-group-async
  "Creates an empty dataset group. A dataset group contains related datasets that supply data for training a model.
   A dataset group can contain at most three datasets, one for each type of dataset:




   Interactions




   Items




   Users




   To train a model (create a solution), a dataset group that contains an Interactions dataset is
   required. Call CreateDataset to add a dataset to the group.


   A dataset group can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING




   To get the status of the dataset group, call DescribeDatasetGroup. If the status shows as CREATE FAILED,
   the response includes a failureReason key, which describes why the creation failed.



   You must wait until the status of the dataset group is ACTIVE before adding a dataset
   to the group.



   You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group. If you specify a
   KMS key, you must also include an AWS Identity and Access Management (IAM) role that has permission to access the
   key.


   APIs that require a dataset group ARN in the request




   CreateDataset




   CreateEventTracker




   CreateSolution




   Related APIs




   ListDatasetGroups




   DescribeDatasetGroup




   DeleteDatasetGroup

  create-dataset-group-request - `com.amazonaws.services.personalize.model.CreateDatasetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDatasetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateDatasetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetGroupRequest create-dataset-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatasetGroupAsync create-dataset-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetGroupRequest create-dataset-group-request]
    (-> this (.createDatasetGroupAsync create-dataset-group-request))))

(defn create-schema-async
  "Creates an Amazon Personalize schema from the specified schema string. The schema you create must be in Avro JSON
   format.


   Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset type and has a set
   of required field and keywords. You specify a schema when you call CreateDataset.


   Related APIs




   ListSchemas




   DescribeSchema




   DeleteSchema

  create-schema-request - `com.amazonaws.services.personalize.model.CreateSchemaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateSchemaResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSchemaRequest create-schema-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSchemaAsync create-schema-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSchemaRequest create-schema-request]
    (-> this (.createSchemaAsync create-schema-request))))

(defn update-campaign-async
  "Updates a campaign by either deploying a new solution or changing the value of the campaign's
   minProvisionedTPS parameter.


   To update a campaign, the campaign status must be ACTIVE or CREATE FAILED. Check the campaign status using the
   DescribeCampaign API.



   You must wait until the status of the updated campaign is ACTIVE before asking the
   campaign for recommendations.



   For more information on campaigns, see CreateCampaign.

  update-campaign-request - `com.amazonaws.services.personalize.model.UpdateCampaignRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.UpdateCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.UpdateCampaignRequest update-campaign-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCampaignAsync update-campaign-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.UpdateCampaignRequest update-campaign-request]
    (-> this (.updateCampaignAsync update-campaign-request))))

(defn list-dataset-import-jobs-async
  "Returns a list of dataset import jobs that use the given dataset. When a dataset is not specified, all the
   dataset import jobs associated with the account are listed. The response provides the properties for each dataset
   import job, including the Amazon Resource Name (ARN). For more information on dataset import jobs, see
   CreateDatasetImportJob. For more information on datasets, see CreateDataset.

  list-dataset-import-jobs-request - `com.amazonaws.services.personalize.model.ListDatasetImportJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasetImportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListDatasetImportJobsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetImportJobsRequest list-dataset-import-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetImportJobsAsync list-dataset-import-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetImportJobsRequest list-dataset-import-jobs-request]
    (-> this (.listDatasetImportJobsAsync list-dataset-import-jobs-request))))

(defn describe-recipe-async
  "Describes a recipe.


   A recipe contains three items:




   An algorithm that trains a model.




   Hyperparameters that govern the training.




   Feature transformation information for modifying the input data before training.




   Amazon Personalize provides a set of predefined recipes. You specify a recipe when you create a solution with the
   CreateSolution API. CreateSolution trains a model by using the algorithm in the specified
   recipe and a training dataset. The solution, when deployed as a campaign, can provide recommendations using the
   GetRecommendations
   API.

  describe-recipe-request - `com.amazonaws.services.personalize.model.DescribeRecipeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRecipe operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeRecipeResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeRecipeRequest describe-recipe-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRecipeAsync describe-recipe-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeRecipeRequest describe-recipe-request]
    (-> this (.describeRecipeAsync describe-recipe-request))))

(defn list-schemas-async
  "Returns the list of schemas associated with the account. The response provides the properties for each schema,
   including the Amazon Resource Name (ARN). For more information on schemas, see CreateSchema.

  list-schemas-request - `com.amazonaws.services.personalize.model.ListSchemasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSchemas operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListSchemasResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSchemasRequest list-schemas-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSchemasAsync list-schemas-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSchemasRequest list-schemas-request]
    (-> this (.listSchemasAsync list-schemas-request))))

(defn create-solution-async
  "Creates the configuration for training a model. A trained model is known as a solution. After the configuration
   is created, you train the model (create a solution) by calling the CreateSolutionVersion operation. Every
   time you call CreateSolutionVersion, a new version of the solution is created.


   After creating a solution version, you check its accuracy by calling GetSolutionMetrics. When you are
   satisfied with the version, you deploy it using CreateCampaign. The campaign provides recommendations to a
   client through the GetRecommendations
   API.


   To train a model, Amazon Personalize requires training data and a recipe. The training data comes from the
   dataset group that you provide in the request. A recipe specifies the training algorithm and a feature
   transformation. You can specify one of the predefined recipes provided by Amazon Personalize. Alternatively, you
   can specify performAutoML and Amazon Personalize will analyze your data and select the optimum
   USER_PERSONALIZATION recipe for you.


   Status


   A solution can be in one of the following states:




   CREATE PENDING > CREATE IN_PROGRESS > ACTIVE -or- CREATE FAILED




   DELETE PENDING > DELETE IN_PROGRESS




   To get the status of the solution, call DescribeSolution. Wait until the status shows as ACTIVE before
   calling CreateSolutionVersion.


   Related APIs




   ListSolutions




   CreateSolutionVersion




   DescribeSolution




   DeleteSolution






   ListSolutionVersions




   DescribeSolutionVersion

  create-solution-request - `com.amazonaws.services.personalize.model.CreateSolutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSolution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateSolutionResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSolutionRequest create-solution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSolutionAsync create-solution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSolutionRequest create-solution-request]
    (-> this (.createSolutionAsync create-solution-request))))

