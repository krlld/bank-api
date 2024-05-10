CREATE TABLE transactions
(
    id                   BIGSERIAL PRIMARY KEY,
    created_at           TIMESTAMP NOT NULL,
    updated_at           TIMESTAMP NOT NULL,
    sender_account_id    BIGINT    NOT NULL,
    recipient_account_id BIGINT    NOT NULL,
    amount               DECIMAL   NOT NULL,
    additional_info      TEXT      NOT NULL
);