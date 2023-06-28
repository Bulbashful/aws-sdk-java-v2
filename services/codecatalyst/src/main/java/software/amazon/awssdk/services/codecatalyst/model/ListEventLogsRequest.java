/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package software.amazon.awssdk.services.codecatalyst.model;

import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.traits.TimestampFormatTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class ListEventLogsRequest extends CodeCatalystRequest implements
        ToCopyableBuilder<ListEventLogsRequest.Builder, ListEventLogsRequest> {
    private static final SdkField<String> SPACE_NAME_FIELD = SdkField.<String> builder(MarshallingType.STRING)
            .memberName("spaceName").getter(getter(ListEventLogsRequest::spaceName)).setter(setter(Builder::spaceName))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("spaceName").build()).build();

    private static final SdkField<Instant> START_TIME_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("startTime")
            .getter(getter(ListEventLogsRequest::startTime))
            .setter(setter(Builder::startTime))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("startTime").build(),
                    TimestampFormatTrait.create(TimestampFormatTrait.Format.ISO_8601)).build();

    private static final SdkField<Instant> END_TIME_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("endTime")
            .getter(getter(ListEventLogsRequest::endTime))
            .setter(setter(Builder::endTime))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("endTime").build(),
                    TimestampFormatTrait.create(TimestampFormatTrait.Format.ISO_8601)).build();

    private static final SdkField<String> EVENT_NAME_FIELD = SdkField.<String> builder(MarshallingType.STRING)
            .memberName("eventName").getter(getter(ListEventLogsRequest::eventName)).setter(setter(Builder::eventName))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("eventName").build()).build();

    private static final SdkField<String> NEXT_TOKEN_FIELD = SdkField.<String> builder(MarshallingType.STRING)
            .memberName("nextToken").getter(getter(ListEventLogsRequest::nextToken)).setter(setter(Builder::nextToken))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("nextToken").build()).build();

    private static final SdkField<Integer> MAX_RESULTS_FIELD = SdkField.<Integer> builder(MarshallingType.INTEGER)
            .memberName("maxResults").getter(getter(ListEventLogsRequest::maxResults)).setter(setter(Builder::maxResults))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("maxResults").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(SPACE_NAME_FIELD,
            START_TIME_FIELD, END_TIME_FIELD, EVENT_NAME_FIELD, NEXT_TOKEN_FIELD, MAX_RESULTS_FIELD));

    private final String spaceName;

    private final Instant startTime;

    private final Instant endTime;

    private final String eventName;

    private final String nextToken;

    private final Integer maxResults;

    private ListEventLogsRequest(BuilderImpl builder) {
        super(builder);
        this.spaceName = builder.spaceName;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.eventName = builder.eventName;
        this.nextToken = builder.nextToken;
        this.maxResults = builder.maxResults;
    }

    /**
     * <p>
     * The name of the space.
     * </p>
     * 
     * @return The name of the space.
     */
    public final String spaceName() {
        return spaceName;
    }

    /**
     * <p>
     * The date and time when you want to start retrieving events, in coordinated universal time (UTC) timestamp format
     * as specified in <a href="https://www.rfc-editor.org/rfc/rfc3339#section-5.6">RFC 3339</a>.
     * </p>
     * 
     * @return The date and time when you want to start retrieving events, in coordinated universal time (UTC) timestamp
     *         format as specified in <a href="https://www.rfc-editor.org/rfc/rfc3339#section-5.6">RFC 3339</a>.
     */
    public final Instant startTime() {
        return startTime;
    }

    /**
     * <p>
     * The time after which you do not want any events retrieved, in coordinated universal time (UTC) timestamp format
     * as specified in <a href="https://www.rfc-editor.org/rfc/rfc3339#section-5.6">RFC 3339</a>.
     * </p>
     * 
     * @return The time after which you do not want any events retrieved, in coordinated universal time (UTC) timestamp
     *         format as specified in <a href="https://www.rfc-editor.org/rfc/rfc3339#section-5.6">RFC 3339</a>.
     */
    public final Instant endTime() {
        return endTime;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @return The name of the event.
     */
    public final String eventName() {
        return eventName;
    }

    /**
     * <p>
     * A token returned from a call to this API to indicate the next batch of results to return, if any.
     * </p>
     * 
     * @return A token returned from a call to this API to indicate the next batch of results to return, if any.
     */
    public final String nextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The maximum number of results to show in a single call to this API. If the number of results is larger than the
     * number you specified, the response will include a <code>NextToken</code> element, which you can use to obtain
     * additional results.
     * </p>
     * 
     * @return The maximum number of results to show in a single call to this API. If the number of results is larger
     *         than the number you specified, the response will include a <code>NextToken</code> element, which you can
     *         use to obtain additional results.
     */
    public final Integer maxResults() {
        return maxResults;
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    public static Builder builder() {
        return new BuilderImpl();
    }

    public static Class<? extends Builder> serializableBuilderClass() {
        return BuilderImpl.class;
    }

    @Override
    public final int hashCode() {
        int hashCode = 1;
        hashCode = 31 * hashCode + super.hashCode();
        hashCode = 31 * hashCode + Objects.hashCode(spaceName());
        hashCode = 31 * hashCode + Objects.hashCode(startTime());
        hashCode = 31 * hashCode + Objects.hashCode(endTime());
        hashCode = 31 * hashCode + Objects.hashCode(eventName());
        hashCode = 31 * hashCode + Objects.hashCode(nextToken());
        hashCode = 31 * hashCode + Objects.hashCode(maxResults());
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return super.equals(obj) && equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ListEventLogsRequest)) {
            return false;
        }
        ListEventLogsRequest other = (ListEventLogsRequest) obj;
        return Objects.equals(spaceName(), other.spaceName()) && Objects.equals(startTime(), other.startTime())
                && Objects.equals(endTime(), other.endTime()) && Objects.equals(eventName(), other.eventName())
                && Objects.equals(nextToken(), other.nextToken()) && Objects.equals(maxResults(), other.maxResults());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ListEventLogsRequest").add("SpaceName", spaceName()).add("StartTime", startTime())
                .add("EndTime", endTime()).add("EventName", eventName()).add("NextToken", nextToken())
                .add("MaxResults", maxResults()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "spaceName":
            return Optional.ofNullable(clazz.cast(spaceName()));
        case "startTime":
            return Optional.ofNullable(clazz.cast(startTime()));
        case "endTime":
            return Optional.ofNullable(clazz.cast(endTime()));
        case "eventName":
            return Optional.ofNullable(clazz.cast(eventName()));
        case "nextToken":
            return Optional.ofNullable(clazz.cast(nextToken()));
        case "maxResults":
            return Optional.ofNullable(clazz.cast(maxResults()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ListEventLogsRequest, T> g) {
        return obj -> g.apply((ListEventLogsRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends CodeCatalystRequest.Builder, SdkPojo, CopyableBuilder<Builder, ListEventLogsRequest> {
        /**
         * <p>
         * The name of the space.
         * </p>
         * 
         * @param spaceName
         *        The name of the space.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder spaceName(String spaceName);

        /**
         * <p>
         * The date and time when you want to start retrieving events, in coordinated universal time (UTC) timestamp
         * format as specified in <a href="https://www.rfc-editor.org/rfc/rfc3339#section-5.6">RFC 3339</a>.
         * </p>
         * 
         * @param startTime
         *        The date and time when you want to start retrieving events, in coordinated universal time (UTC)
         *        timestamp format as specified in <a href="https://www.rfc-editor.org/rfc/rfc3339#section-5.6">RFC
         *        3339</a>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder startTime(Instant startTime);

        /**
         * <p>
         * The time after which you do not want any events retrieved, in coordinated universal time (UTC) timestamp
         * format as specified in <a href="https://www.rfc-editor.org/rfc/rfc3339#section-5.6">RFC 3339</a>.
         * </p>
         * 
         * @param endTime
         *        The time after which you do not want any events retrieved, in coordinated universal time (UTC)
         *        timestamp format as specified in <a href="https://www.rfc-editor.org/rfc/rfc3339#section-5.6">RFC
         *        3339</a>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder endTime(Instant endTime);

        /**
         * <p>
         * The name of the event.
         * </p>
         * 
         * @param eventName
         *        The name of the event.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder eventName(String eventName);

        /**
         * <p>
         * A token returned from a call to this API to indicate the next batch of results to return, if any.
         * </p>
         * 
         * @param nextToken
         *        A token returned from a call to this API to indicate the next batch of results to return, if any.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextToken(String nextToken);

        /**
         * <p>
         * The maximum number of results to show in a single call to this API. If the number of results is larger than
         * the number you specified, the response will include a <code>NextToken</code> element, which you can use to
         * obtain additional results.
         * </p>
         * 
         * @param maxResults
         *        The maximum number of results to show in a single call to this API. If the number of results is larger
         *        than the number you specified, the response will include a <code>NextToken</code> element, which you
         *        can use to obtain additional results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder maxResults(Integer maxResults);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends CodeCatalystRequest.BuilderImpl implements Builder {
        private String spaceName;

        private Instant startTime;

        private Instant endTime;

        private String eventName;

        private String nextToken;

        private Integer maxResults;

        private BuilderImpl() {
        }

        private BuilderImpl(ListEventLogsRequest model) {
            super(model);
            spaceName(model.spaceName);
            startTime(model.startTime);
            endTime(model.endTime);
            eventName(model.eventName);
            nextToken(model.nextToken);
            maxResults(model.maxResults);
        }

        public final String getSpaceName() {
            return spaceName;
        }

        public final void setSpaceName(String spaceName) {
            this.spaceName = spaceName;
        }

        @Override
        public final Builder spaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }

        public final Instant getStartTime() {
            return startTime;
        }

        public final void setStartTime(Instant startTime) {
            this.startTime = startTime;
        }

        @Override
        public final Builder startTime(Instant startTime) {
            this.startTime = startTime;
            return this;
        }

        public final Instant getEndTime() {
            return endTime;
        }

        public final void setEndTime(Instant endTime) {
            this.endTime = endTime;
        }

        @Override
        public final Builder endTime(Instant endTime) {
            this.endTime = endTime;
            return this;
        }

        public final String getEventName() {
            return eventName;
        }

        public final void setEventName(String eventName) {
            this.eventName = eventName;
        }

        @Override
        public final Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        public final String getNextToken() {
            return nextToken;
        }

        public final void setNextToken(String nextToken) {
            this.nextToken = nextToken;
        }

        @Override
        public final Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public final Integer getMaxResults() {
            return maxResults;
        }

        public final void setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
        }

        @Override
        public final Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        @Override
        public Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration) {
            super.overrideConfiguration(overrideConfiguration);
            return this;
        }

        @Override
        public Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer) {
            super.overrideConfiguration(builderConsumer);
            return this;
        }

        @Override
        public ListEventLogsRequest build() {
            return new ListEventLogsRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}